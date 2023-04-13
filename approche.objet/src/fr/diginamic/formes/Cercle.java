package fr.diginamic.formes;

public class Cercle extends Forme{

	private Double rayon;
	
	public Cercle(Double rayon) {
		this.rayon = rayon;
	}

	public Double getRayon() {
		return rayon;
	}

	public void setRayon(Double rayon) {
		this.rayon = rayon;
	}

	@Override
	public Double calculerSurface() {
		return (rayon*2)*Math.PI;
	}

	@Override
	public Double calculerPerimetre() {
		return (Math.pow(rayon, 2))*Math.PI;
	}
	
}
