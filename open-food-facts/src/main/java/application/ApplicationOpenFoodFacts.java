package application;

import java.io.IOException;
import java.util.Scanner;

import entites.Stock;
import services.AfficherTopAdditifs;
import services.AfficherTopAllergenes;
import services.RechercherMeilleursProduitsCategorie;
import services.RechercherMeilleursProduitsMarque;
import services.RechercherMeilleursProduitsMarqueEtCategorie;

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
				case 2:
					RechercherMeilleursProduitsCategorie rechercheTopCategorie = new RechercherMeilleursProduitsCategorie();
					rechercheTopCategorie.traiter(stockTotal, scanner);
					break;
				case 3:
					RechercherMeilleursProduitsMarqueEtCategorie rechercheTopMarqueEtCategorie = new RechercherMeilleursProduitsMarqueEtCategorie();
					rechercheTopMarqueEtCategorie.traiter(stockTotal, scanner);
					break;
				case 4:
					AfficherTopAllergenes affichageTopAllergenes = new AfficherTopAllergenes();
					affichageTopAllergenes.traiter(stockTotal, scanner);
					break;
				case 5:
					AfficherTopAdditifs affichageTopAdditifs = new AfficherTopAdditifs();
					affichageTopAdditifs.traiter(stockTotal, scanner);
					break;
				case 99:
					System.out.println("*** Vous quittez l'application, au revoir ! ***");
					break;
				default:
					System.out.println("Erreur : merci de saisir un numéro de menu valide");
					System.out.println();
					break;
				}
			} catch(NumberFormatException e) {
				System.out.println("Erreur : merci de saisir un nombre");
				System.out.println();
			}
			
		}
	}
	
	public static void afficherMenu() {
		System.out.println("1. Rechercher les meilleurs produits d'une marque");
		System.out.println("2. Rechercher les meilleurs produits d'une catégorie");
		System.out.println("3. Rechercher les meilleurs produits d'une marque et d'une catégorie");
		System.out.println("4. Afficher les allergènes les plus courants");
		System.out.println("5. Afficher les additifs les plus courants");
		System.out.println("99. Quitter");
	}
}
