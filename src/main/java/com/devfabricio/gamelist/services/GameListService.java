package com.devfabricio.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devfabricio.gamelist.dto.GameListDTO;
import com.devfabricio.gamelist.dto.GameMinDTO;
import com.devfabricio.gamelist.entities.GameList;
import com.devfabricio.gamelist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
