package com.igs.ipi.tpspringbootcedricBerthezene.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.igs.ipi.tpspringbootcedricBerthezene.component.PartieEnCours;
import com.igs.ipi.tpspringbootcedricBerthezene.model.GameModel;
import com.igs.ipi.tpspringbootcedricBerthezene.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@Autowired
	private PartieEnCours partieEnCours;
	
	@GetMapping("/new")
	public ModelAndView newGame() {
		GameModel gm = gameService.newGame();
		partieEnCours.setPartieEnCours(gm);
		ModelAndView mv = new ModelAndView("game");
		mv.addObject("gm", gm);  
		return mv; 
	}
	
	@GetMapping("/")
	public ModelAndView partieEnCours() {
		GameModel pec = partieEnCours.getPartieEnCours(); 
		ModelAndView mv = new ModelAndView("game");
		mv.addObject("gm", pec);
		if (pec==null) {
			throw new RuntimeException("Pas de partie en cours"); 
		}
		return mv; 
	}
	
	
	// Fonction qui retourne la colonne du tableau 
	@GetMapping("/drop/{numColonne}")
	public ModelAndView drop(@PathVariable Integer numColonne) {
		// On sélectionne le template à afficher
		ModelAndView mv = new ModelAndView("game"); 
		// Je récupère la partie en cours
		GameModel gm = partieEnCours.getPartieEnCours(); 
		//
		int index = numColonne - 1; 
		// Appel de la fonction add - ajout d'un nouveau jeton en fonction de l'indice 
		gm.add(index); 
		// Ajout de la variable à la vue
		mv.addObject("gm", gm); 
		return mv; 
	}	
	
	
}
