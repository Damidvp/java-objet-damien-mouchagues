package test;

import java.io.IOException;

import entites.Produit;
import entites.Stock;

public class TestAffichageProduits {

	public static void main(String[] args) throws IOException {
		Stock stockTotal = new Stock();
		for(Produit unProduit : stockTotal.getTousLesProduits()) {
			System.out.println(unProduit.toString());
		}
	}

}
