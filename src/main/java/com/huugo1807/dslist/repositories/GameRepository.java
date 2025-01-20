package com.huugo1807.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huugo1807.dslist.entities.Game;

public interface GameRepository  extends JpaRepository<Game, Long>{

	
}
