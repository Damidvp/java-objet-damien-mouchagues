package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, int montantOperation) {
		super(date, montantOperation);
	}
	
	public String toString() {
		return "Crédit effectué - " + super.toString();
	}

	public String getType() {
		return "CREDIT";
	}

}
