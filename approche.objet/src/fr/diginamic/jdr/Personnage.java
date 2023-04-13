package fr.diginamic.jdr;

public class Personnage {
	
	private int force;
	private int pv;
	private int score;
	
	public Personnage() {
		this.force = (int) (Math.random() * 7) + 12;
		this.pv = (int) (Math.random() * 31) + 20;
		this.score = 0;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public int getAttaque() {
		return this.force + ((int) (Math.random() * 10) + 1);
	}
	
	public void afficherPersonnage() {
		System.out.println("*** VOTRE PERSONNAGE ***");
		System.out.println("Force " + this.force);
		System.out.println("Vie " + this.pv);
		System.out.println();
	}
	
}
