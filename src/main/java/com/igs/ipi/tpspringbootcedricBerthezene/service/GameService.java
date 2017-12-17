package com.igs.ipi.tpspringbootcedricBerthezene.service;

import org.springframework.stereotype.Service;

import com.igs.ipi.tpspringbootcedricBerthezene.model.GameModel;

@Service
public class GameService {
	
	public GameModel newGame() {
		GameModel gm = new GameModel(); 
		gm.setNom1("Jean");
		gm.setNom2("Marc");
		return gm; 
	}

}
