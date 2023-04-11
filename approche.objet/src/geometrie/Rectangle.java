package geometrie;

public class Rectangle implements ObjetGeometrique {
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double perimetre() {
		return (this.longueur + this.largeur)*2;
	}
	
	public double surface() {
		return this.longueur * this.largeur;
	}
	
	public String toString() {
		return "RECTANGLE DE LONGUEUR " + this.longueur + " ET DE LARGEUR " + this.largeur + " - Périmètre : " + 
				this.perimetre() + " / Surface : " + this.surface();
	}
}
