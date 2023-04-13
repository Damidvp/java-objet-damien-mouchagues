package fr.diginamic.maison;

public class Piece {
	
	private Double superficie;
	private int etage;
	
	public Piece(Double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}
	
}
