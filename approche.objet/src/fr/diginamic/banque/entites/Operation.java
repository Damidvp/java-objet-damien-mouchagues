package fr.diginamic.banque.entites;

public abstract class Operation {
	private String date;
	private int montantOperation;
	
	public Operation(String date, int montantOperation) {
		this.date = date;
		this.montantOperation = montantOperation;
	}
	
	public String toString() {
		return this.date + " : " + this.montantOperation + " €";
	}
	
	public abstract String getType();
	
	public int getMontantOperation() {
		return this.montantOperation;
	}
}
