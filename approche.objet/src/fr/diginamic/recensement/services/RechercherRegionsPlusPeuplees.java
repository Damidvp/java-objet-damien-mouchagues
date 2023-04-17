package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import fr.diginamic.recensement.ComparatorPopulation;
import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RechercherRegionsPlusPeuplees extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		HashMap<String, Integer> topRegions = new HashMap<String, Integer>();
		
		int popTotale = 0;
		for(Ville uneVille : recensement.getRecensementVilles()) {
			if(!topRegions.containsKey(uneVille.getRegionVille().getNomRegion())) {
				popTotale = 0;
				topRegions.put(uneVille.getRegionVille().getNomRegion(), popTotale);
			} else {
				popTotale += uneVille.getPopulationTotale();
				topRegions.put(uneVille.getRegionVille().getNomRegion(), popTotale);
			}
		}
		
		ArrayList<Integer> sortedValues = new ArrayList<Integer>(topRegions.values());
		Collections.sort(sortedValues, new ComparatorPopulation());
		
		afficherResultat(topRegions, sortedValues);
	}
	
	public static String getKey(HashMap<String, Integer> map, Integer value) {
		for(String key : map.keySet()) {
			if(value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}
	
	public static void afficherResultat(HashMap<String, Integer> map, ArrayList<Integer> array) {
		for(int i=0; i<10; i++) {
			System.out.println("[" + (i+1) + "] " + getKey(map, array.get(i)) + " : " + array.get(i) + " habitants");
		}
		System.out.println();
	}
	
}
