package fr.diginamic.banque.entites;

public class TestBanque {
	
	public static void main(String[] args) {
		Compte unCompte = new Compte(1, 13294);
		System.out.println("Solde du compte n° " + unCompte.getNumeroCompte() + " : " + unCompte.getSoldeCompte() + " euros");
		
		unCompte.debiter(6300);
		System.out.println("Grosse dépense (-6300)");
		System.out.println("Nouveau solde : " + unCompte.getSoldeCompte());
		
		unCompte.crediter(1800);
		System.out.println("Vous recevez votre salaire (+1800)");
		System.out.println("Nouveau solde : " + unCompte.getSoldeCompte());
	}
	
}
