package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import comparators.ComparatorNbElements;
import entites.Additif;
import entites.Produit;
import entites.Stock;

public class AfficherTopAdditifs extends MenuService {

	@Override
	public void traiter(Stock stockProduits, Scanner scanner) {
		HashMap<String, Integer> additifsCourants = new HashMap<String, Integer>();
		ArrayList<Integer> nbAdditifsCourants = new ArrayList<Integer>();
		for(Produit unProduit : stockProduits.getTousLesProduits()) {
			for(Additif unAdditifProduit : unProduit.getListeAdditifs()) {
				if(!unAdditifProduit.getLibelle().equals("")) {
					String formattedKey = unAdditifProduit.getLibelle()
							.replace(" ", "")
							.replace("en:", "")
							.replace("fish", "poisson")
							.replace("milk", "lait")
							.replace("soybeans", "soja")
							.replace("nuts", "noisettes")
							.replace("eggs", "oeufs")
							.replace("œ", "oe")
							.replace("oeuf", "oeufs")
							.replace("oeufss", "oeufs")
							.toLowerCase();
					if(additifsCourants.containsKey(formattedKey)) {
						additifsCourants.put(formattedKey, additifsCourants.get(formattedKey)+1);
					} else {
						additifsCourants.put(formattedKey, 1);
					}
				}
			}
		}
		
		nbAdditifsCourants.addAll(additifsCourants.values());
		Collections.sort(nbAdditifsCourants, new ComparatorNbElements());
		
		afficherTop(additifsCourants, nbAdditifsCourants, 20);
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
