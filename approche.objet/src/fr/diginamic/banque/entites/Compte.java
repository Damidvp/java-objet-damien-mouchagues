package fr.diginamic.banque.entites;

public class Compte {
	private int numeroCompte;
	private int soldeCompte;
	
	public Compte(int numeroCompte, int soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	
	public int getNumeroCompte() {
		return this.numeroCompte;
	}
	
	public int getSoldeCompte() {
		return this.soldeCompte;
	}
	
	public void debiter(int debit) {
		this.soldeCompte -= debit;
	}
	
	public void crediter(int credit) {
		this.soldeCompte += credit;
	}
	
	public String toString() {
		return "Solde du compte n° " + this.numeroCompte + " : " + this.soldeCompte + " euros";
	}
}
