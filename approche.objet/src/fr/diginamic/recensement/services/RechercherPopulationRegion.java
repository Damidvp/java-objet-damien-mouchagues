package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RechercherPopulationRegion extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Saisir le nom d'une région : ");
		String regionRecherchee = scanner.nextLine();
		int populationTotale = 0;
		for(Ville uneVille : recensement.getRecensementVilles()) {
			if(uneVille.getRegionVille().getNomRegion().equals(regionRecherchee)) {
				populationTotale += uneVille.getPopulationTotale();
			}
		}
		afficherResultat(populationTotale, regionRecherchee);
	}
	
	public static void afficherResultat(int population, String region) {
		if(population > 0) {
			System.out.println("Population totale de la région " + region + " : " + population + " habitants");
		} else {
			System.out.println("Aucun résultat pour cette région");
		}
		System.out.println();
	}
}
