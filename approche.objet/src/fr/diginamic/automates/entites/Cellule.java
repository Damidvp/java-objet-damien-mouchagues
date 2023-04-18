package fr.diginamic.automates.entites;

public class Cellule {
	
	private int positionX;
	private int positionY;
	private boolean isDead;
	
	public Cellule(int positionX, int positionY, boolean isDead) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.isDead = isDead;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	
}
