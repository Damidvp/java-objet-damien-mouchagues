package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.recensement.ComparatorVille;
import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RechercherTopVillesParDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		ArrayList<Ville> topVilles = new ArrayList<Ville>();
		
		System.out.println("Saisir un numéro de département :");
		String departementRecherche = scanner.nextLine();
		
		for(Ville uneVille : recensement.getRecensementVilles()) {
			if(uneVille.getDepartementVille().getCodeDepartement().equals(departementRecherche)) {
				topVilles.add(uneVille);
			}
		}
		Collections.sort(topVilles, new ComparatorVille());
		
		afficherResultat(topVilles, departementRecherche);
	}
	
	public static void afficherResultat(ArrayList<Ville> array, String departement) {
		if(array.size() > 0) {
			System.out.println("*** TOP VILLES DEPARTEMENT " + departement + " ***");
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
