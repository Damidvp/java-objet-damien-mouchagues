package fr.diginamic.formes;

public class Rectangle extends Forme {
	
	private Double longueur;
	private Double largeur;
	
	public Rectangle(Double longueur, Double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public Double getLongueur() {
		return longueur;
	}

	public void setLongueur(Double longueur) {
		this.longueur = longueur;
	}

	public Double getLargeur() {
		return largeur;
	}

	public void setLargeur(Double largeur) {
		this.largeur = largeur;
	}

	@Override
	public Double calculerSurface() {
		return (this.longueur + this.largeur)*2;
	}

	@Override
	public Double calculerPerimetre() {
		return this.longueur * this.largeur;
	}
	
	
}
