package fr.diginamic.formes;

public class Carre extends Rectangle {

	private Double longueur;
	
	public Carre(Double longueur) {
		super(longueur, longueur);
	}

	public Double getLongueur() {
		return longueur;
	}

	public void setLongueur(Double longueur) {
		this.longueur = longueur;
	}

}
