package application;

import java.io.IOException;
import java.util.Scanner;

import entites.Stock;
import services.RechercherMeilleursProduitsMarque;

public class ApplicationOpenFoodFacts {

	public static void main(String[] args) throws IOException {
		
		System.out.println("*** OPEN FOOD FACTS ***");
		Stock stockTotal = new Stock();
		
		Scanner scanner = new Scanner(System.in);
		String choixMenu = "";
		while(!choixMenu.equals("99")) {
			afficherMenu();
			choixMenu = scanner.nextLine();
			try {
				switch(Integer.parseInt(choixMenu)) {
				case 1:
					RechercherMeilleursProduitsMarque rechercheTopMarque = new RechercherMeilleursProduitsMarque();
					rechercheTopMarque.traiter(stockTotal, scanner);
					break;
				case 99:
					System.out.println("*** Vous quittez l'application, au revoir ! ***");
					break;
				}
			} catch(NumberFormatException e) {
				System.out.println("Erreur : menu sélectionné non valide");
			}
			
		}
	}
	
	public static void afficherMenu() {
		System.out.println("1. Rechercher les meilleurs produits d'une marque");
		System.out.println("99. Quitter");
	}
}
