package com.devfabricio.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfabricio.gamelist.dto.GameMinDTO;
import com.devfabricio.gamelist.entities.Game;
import com.devfabricio.gamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
