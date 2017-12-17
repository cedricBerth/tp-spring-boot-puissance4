package enu;

public enum Jeton {
	ROUGE, 
	BLEU, 
	VIDE;
	
	public String getCode() {
		// Retourne l'image correspondante au type d'énumération
		switch(this) {
		case ROUGE : 
			return "rouge.png";
		case BLEU : 
			return "bleu.png";
		default : 
			return null; 
		}
	}
}


