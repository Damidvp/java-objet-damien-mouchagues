package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.recensement.ComparatorVille;
import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RechercherTopVillesFrance extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		ArrayList<Ville> topVilles = new ArrayList<Ville>();
		for(Ville uneVille : recensement.getRecensementVilles()) {
			topVilles.add(uneVille);
		}
		Collections.sort(topVilles, new ComparatorVille());
		
		afficherResultat(topVilles);
	}
	
	public static void afficherResultat(ArrayList<Ville> array) {
		System.out.println("*** TOP VILLES FRANCE ***");
		for(int i=0; i<10; i++) {
			System.out.println("[" + (i+1) + "] " + array.get(i).getNomCommune() + " : " + array.get(i).getPopulationTotale() + 
					" habitants");
		}
		System.out.println();
	}
	
}
