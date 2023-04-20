package swing.services;

import java.io.IOException;
import java.util.ArrayList;

import entites.Produit;
import entites.Stock;

public class Marques {
	
	private ArrayList<String> allMarques = new ArrayList<String>();
	
	public Marques() throws IOException {
		Stock allProduits = new Stock();
		for(Produit unProduit : allProduits.getTousLesProduits()) {
			if(!allMarques.contains(unProduit.getMarque().getLibelle())) {
				this.allMarques.add(unProduit.getMarque().getLibelle());
			}
		}
	}

	public ArrayList<String> getAllCategories() {
		return allMarques;
	}

	public void setAllCategories(ArrayList<String> allCategories) {
		this.allMarques = allCategories;
	}
}
