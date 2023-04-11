package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, int montantOperation) {
		super(date, montantOperation);
	}
	
	public String toString() {
		return "Débit effectué - " + super.toString();
	}

	public String getType() {	
		return "DEBIT";
	}

}
