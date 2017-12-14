package com.igs.ipi.tpspringbootcedricBerthezene.model;

public class GameModel {
	
	private String nom1; 
	private String nom2;
	private int jetons[][] = new int[7][6]; 
	
	public GameModel(String nom1, String nom2) {
		this.nom1 = nom1; 
		this.nom2 = nom2; 
	}
	
	public GameModel() {
		for (int i = 0; i < jetons.length; i++) {
			for (int j = 0; j < jetons[i].length; j++) {
				jetons[i][j] = 0; 
			}
		}
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
	public int[][] getTabInt() {
		return this.tableauInt; 
	}
	
	

}
