package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import comparators.ComparatorGrade;
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
				if(unProduit.getGrade().equals('a') || unProduit.getGrade().equals('b')) {
					resultatRecherche.add(unProduit);
				}
			}
		}
		
		if(resultatRecherche.size() == 0) {
			System.out.println("Aucun résultat trouvé");
		} else {
			Collections.sort(resultatRecherche, new ComparatorGrade());
			for(Produit unResultat : resultatRecherche) {
				System.out.println(unResultat.toString());
			}	
		}
		
		System.out.println();
	}

}
