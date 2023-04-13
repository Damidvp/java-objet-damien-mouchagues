package fr.diginamic.jdr;

public class Creature {
	
	private int force;
	private int pv;
	
	public Creature(int force, int pv) {
		this.force = force;
		this.pv = pv;
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
	
	public void afficherInfosCreature() {
		System.out.println(this.getClass().getSimpleName() + " : " + this.force + " PA, " + this.pv + " PV");
	}
	
	public int getAttaque() {
		return this.force + ((int) (Math.random() * 10) + 1);
	}
	
}

