package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		Operation[] listeOperations = new Operation[6];
		listeOperations[0] = new Credit("11/04/2023", 500);
		listeOperations[1] = new Credit("13/04/2023", 1000);
		listeOperations[2] = new Debit("14/04/2023", 200);
		listeOperations[3] = new Credit("11/04/2023", 50);
		listeOperations[4] = new Debit("13/04/2023", 500);
		listeOperations[5] = new Debit("14/04/2023", 130);
		int montantGlobal = 0;
		
		for(Operation uneOperation : listeOperations) {
			System.out.println(uneOperation.toString());
			if(uneOperation.getType() == "DEBIT") {
				montantGlobal -= uneOperation.getMontantOperation();
			} else {
				montantGlobal += uneOperation.getMontantOperation();
			}
		}
		
		if(montantGlobal > 0) {
			System.out.println("Montant global : +" + montantGlobal + " €");
		} else {
			System.out.println("Montant global : " + montantGlobal + " €");
		}
		
	}

}
