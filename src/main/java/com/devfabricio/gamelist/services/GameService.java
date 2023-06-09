package com.devfabricio.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devfabricio.gamelist.dto.GameDTO;
import com.devfabricio.gamelist.dto.GameMinDTO;
import com.devfabricio.gamelist.entities.Game;
import com.devfabricio.gamelist.projections.GameMinProjection;
import com.devfabricio.gamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
