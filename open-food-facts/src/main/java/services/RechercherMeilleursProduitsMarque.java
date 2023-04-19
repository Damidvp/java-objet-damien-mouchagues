package services;

import java.util.ArrayList;
import java.util.Scanner;

import entites.Produit;
import entites.Stock;

public class RechercherMeilleursProduitsMarque extends MenuService {

	@Override
	public void traiter(Stock stockProduits, Scanner scanner) {
		
		System.out.println("Saisir le nom d'une marque : ");
		String nomMarque = scanner.nextLine();
		
		ArrayList<Produit> resultatRecherche = new ArrayList<Produit>();
		
		for(Produit unProduit : stockProduits.getTousLesProduits()) {
			if(unProduit.getMarque().getLibelle().equals(nomMarque)) {
				if(unProduit.getGrade().equals('a')) {
					resultatRecherche.add(unProduit);
				}
			}
		}
		
		for(Produit unResultat : resultatRecherche) {
			System.out.println(unResultat.toString());
		}
		
	}

}
