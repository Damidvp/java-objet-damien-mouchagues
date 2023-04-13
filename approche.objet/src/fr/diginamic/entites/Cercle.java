package fr.diginamic.entites;

public class Cercle {
	
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double perimetre() {
		return (rayon*2)*Math.PI;
	}
	
	public double surface() {
		return (Math.pow(rayon, 2))*Math.PI;
	}
	
	public String toString() {
		return "CERCLE DE RAYON " + this.rayon + " - Périmètre : " + this.perimetre() + " / Surface : " + this.surface();
	}
}
