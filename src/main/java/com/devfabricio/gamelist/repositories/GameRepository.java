package com.devfabricio.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfabricio.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
