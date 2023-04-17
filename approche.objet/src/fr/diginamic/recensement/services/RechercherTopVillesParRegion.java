package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.recensement.ComparatorVille;
import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RechercherTopVillesParRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		ArrayList<Ville> topVilles = new ArrayList<Ville>();
		
		System.out.println("Saisir le nom d'une région :");
		String regionRecherchee = scanner.nextLine();
		
		for(Ville uneVille : recensement.getRecensementVilles()) {
			if(uneVille.getRegionVille().getNomRegion().equals(regionRecherchee)) {
				topVilles.add(uneVille);
			}
		}
		Collections.sort(topVilles, new ComparatorVille());
		
		afficherResultat(topVilles, regionRecherchee);
	}
	
	public static void afficherResultat(ArrayList<Ville> array, String region) {
		if(array.size() > 0) {
			System.out.println("*** TOP VILLES REGION " + region.toUpperCase() + " ***");
			for(int i=0; i<10; i++) {
				System.out.println("[" + (i+1) + "] " + array.get(i).getNomCommune() + " : " + array.get(i).getPopulationTotale() + 
						" habitants");
			}
		} else {
			System.out.println("Aucun résultat trouvé");
		}
		System.out.println();
	}
	
}
