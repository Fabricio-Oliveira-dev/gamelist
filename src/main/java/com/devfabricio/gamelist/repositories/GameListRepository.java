package com.devfabricio.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfabricio.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
