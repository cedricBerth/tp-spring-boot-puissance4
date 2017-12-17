package com.igs.ipi.tpspringbootcedricBerthezene.model;

import enu.Jeton;

public class GameModel {
	
	private String nom1; 
	private String nom2;
	// Tableau d'enum jeton
	private Jeton jetons[][] = new Jeton[7][6]; 
	// Booléen pour définir le tour du joueur
	private boolean tourJoueur1; 
	
	public boolean isTourJoueur1() {
		return tourJoueur1;
	}

	public void setTourJoueur1(boolean tourJoueur1) {
		this.tourJoueur1 = tourJoueur1;
	}

	public GameModel(String nom1, String nom2) {
		this.nom1 = nom1; 
		this.nom2 = nom2; 
	}
	
	public GameModel() {
		for (int i = 0; i < jetons.length; i++) {
			for (int j = 0; j < jetons[i].length; j++) {
				jetons[i][j] = Jeton.VIDE; 
			}
		}
		// Pour chaque nouvelle partie, c'est toujours au premier joueur de commencer
		tourJoueur1 = true; 
	}
	
	public String getNom1() {
		return nom1;
	}
	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}
	public String getNom2() {
		return nom2;
	}
	public void setNom2(String nom2) {
		this.nom2 = nom2;
	} 
	
	// Tableau de int
	public Jeton[][] getJetons() {
		return this.jetons; 
	}
	
	// Ajout d'un nouveau jeton au tableau 
	public void add(Integer index) {
		// On parcours le tableau de bas en haut en itérant sur la ligne
		for (int h = this.jetons.length - 1; h >= 0; h--) {
			// On vérifie si la ligne sélectionné possède déjà un jeton avec 0
			if (jetons[h][index] == Jeton.VIDE) {
				if (tourJoueur1) {
					jetons[h][index] = Jeton.ROUGE;
					tourJoueur1 = false;
				} else {
					// le joueur 2 a joué donc tourJoueur1 revient à true
					jetons[h][index] = Jeton.BLEU; 
					tourJoueur1 = true; 
				}
				
				return; // Ce return permet de ne faire l'opération qu'une fois 
			}
		}
		// La place est déjà occupé erreur
		throw new IllegalArgumentException("Place déjà occupée par le jeton"); 
	}
	
	// vérifier si le joueur a gagné
	
	

}
