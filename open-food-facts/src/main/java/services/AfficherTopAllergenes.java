package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import comparators.ComparatorNbElements;
import entites.Allergene;
import entites.Produit;
import entites.Stock;

public class AfficherTopAllergenes extends MenuService {

	@Override
	public void traiter(Stock stockProduits, Scanner scanner) {
		HashMap<String, Integer> allergenesCourants = new HashMap<String, Integer>();
		ArrayList<Integer> nbAllergenesCourants = new ArrayList<Integer>();
		for(Produit unProduit : stockProduits.getTousLesProduits()) {
			for(Allergene unAllergeneProduit : unProduit.getListeAllergenes()) {
				if(!unAllergeneProduit.getLibelle().equals("")) {
					if(allergenesCourants.containsKey(unAllergeneProduit.getLibelle())) {
						allergenesCourants.put(unAllergeneProduit.getLibelle(), allergenesCourants.get(unAllergeneProduit.getLibelle())+1);
					} else {
						allergenesCourants.put(unAllergeneProduit.getLibelle(), 1);
					}
				}
			}
		}
		
		nbAllergenesCourants.addAll(allergenesCourants.values());
		Collections.sort(nbAllergenesCourants, new ComparatorNbElements());
		
		afficherTop(allergenesCourants, nbAllergenesCourants, 20);
	}
	
	public static String getKey(HashMap<String, Integer> map, Integer value) {
		for(String key : map.keySet()) {
			if(value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}
	
	public static void afficherTop(HashMap<String, Integer> map, ArrayList<Integer> array, int top) {
		for(int i=0; i<top; i++) {
			System.out.println("[" + (i+1) + "] " + getKey(map, array.get(i)) + " présent dans " + array.get(i) + " produits");
		}
		System.out.println();
	}
}
