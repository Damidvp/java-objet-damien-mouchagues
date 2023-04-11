package fr.diginamic.banque.entites;

public class TestBanque {
	
	public static void main(String[] args) {
		Compte unCompte = new Compte(1, 13294);
		System.out.println(unCompte.toString());
		
		unCompte.debiter(6300);
		System.out.println("Grosse dépense (-6300)");
		System.out.println(unCompte.toString());
		
		unCompte.crediter(1800);
		System.out.println("Vous recevez votre salaire (+1800)");
		System.out.println(unCompte.toString());
	}
	
}
