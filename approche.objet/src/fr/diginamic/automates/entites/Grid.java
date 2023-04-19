package fr.diginamic.automates.entites;

public class Grid {
	private int width;
	private int height;
	private Cellule[][] cellules;
	
	public Grid(int width, int height, Cellule[][] cellules) {
		this.width = width;
		this.height = height;
		this.cellules = cellules;
	}
	
	public Grid() {
		this.width = 0;
		this.height = 0;
		this.cellules = null;
	}

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Cellule[][] getCellules() {
		return cellules;
	}
	
	public void setCellules(Cellule[][] cellules) {
		this.cellules = cellules;
	}
	
	
}
