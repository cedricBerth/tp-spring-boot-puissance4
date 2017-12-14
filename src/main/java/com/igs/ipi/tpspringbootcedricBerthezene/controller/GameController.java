package com.igs.ipi.tpspringbootcedricBerthezene.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.igs.ipi.tpspringbootcedricBerthezene.model.GameModel;
import com.igs.ipi.tpspringbootcedricBerthezene.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	private GameService gameService; 
	
	@GetMapping("/new")
	public ModelAndView newGame() {
		GameModel gm = gameService.newGame();
		ModelAndView mv = new ModelAndView("game");
		mv.addObject("gm", gm);  
		return mv; 
		
	}
	
}
