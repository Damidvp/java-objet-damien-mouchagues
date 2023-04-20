package swing.services;

import java.io.IOException;
import java.util.ArrayList;

import entites.Produit;
import entites.Stock;

public class Categories {
	
	private ArrayList<String> allCategories = new ArrayList<String>();
	
	public Categories() throws IOException {
		Stock allProduits = new Stock();
		for(Produit unProduit : allProduits.getTousLesProduits()) {
			if(!allCategories.contains(unProduit.getCategorie().getLibelle())) {
				this.allCategories.add(unProduit.getCategorie().getLibelle());
			}
		}
	}

	public ArrayList<String> getAllCategories() {
		return allCategories;
	}

	public void setAllCategories(ArrayList<String> allCategories) {
		this.allCategories = allCategories;
	}
	
}
