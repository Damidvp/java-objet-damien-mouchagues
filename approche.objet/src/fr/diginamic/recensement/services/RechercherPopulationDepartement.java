package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RechercherPopulationDepartement extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Saisir un numéro de département : ");
		String departementRecherche = scanner.nextLine();
		int populationTotale = 0;
		for(Ville uneVille : recensement.getRecensementVilles()) {
			if(uneVille.getDepartementVille().getCodeDepartement().equals(departementRecherche)) {
				populationTotale += uneVille.getPopulationTotale();
			}
		}
		afficherResultat(populationTotale, departementRecherche);
	}
	
	public static void afficherResultat(int population, String departement) {
		if(population > 0) {
			System.out.println("Population totale du département " + departement + " : " + population + " habitants");
		} else {
			System.out.println("Aucun résultat pour ce département");
		}
		System.out.println();
	}
}
