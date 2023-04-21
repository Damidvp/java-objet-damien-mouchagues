package entites;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Produit> tousLesProduits;

	public Stock() throws IOException {
		List<Produit> listeProduitsFichier = new ArrayList<Produit>();
		List<String> linesFichier = new ArrayList<String>();
		Path pathFichier = Paths.get("c:/dev-java/open-food-facts.csv");
		linesFichier = Files.readAllLines(pathFichier, StandardCharsets.UTF_8);
		
		for(String uneLigne : linesFichier) {
			if(linesFichier.indexOf(uneLigne) > 0) {
				String[] tokens = uneLigne.split("\\|");
				Categorie categorieProduit = new Categorie(tokens[0]);
				Marque marqueProduit = new Marque(tokens[1]);
				Character gradeProduit = tokens[3].charAt(0);
				ArrayList<Ingredient> ingredientsProduit = new ArrayList<Ingredient>();
				ArrayList<Additif> additifsProduit = new ArrayList<Additif>();
				ArrayList<Allergene> allergenesProduit = new ArrayList<Allergene>();
				Double energieProduit = 0.0;
				Double graisseProduit = 0.0;
				Double sucresProduit = 0.0;
				Double fibresProduit = 0.0;
				Double proteinesProduit = 0.0;
				try {
					energieProduit = Double.parseDouble(tokens[5]);
				} catch (NumberFormatException e) {
					energieProduit = 0.0;
				}
				try {
					graisseProduit = Double.parseDouble(tokens[6]);
				} catch (NumberFormatException e) {
					graisseProduit = 0.0;
				}
				try {
					sucresProduit = Double.parseDouble(tokens[7]);
				} catch (NumberFormatException e) {
					sucresProduit = 0.0;
				}
				try {
					fibresProduit = Double.parseDouble(tokens[8]);
				} catch (NumberFormatException e) {
					fibresProduit = 0.0;
				}
				try {
					proteinesProduit = Double.parseDouble(tokens[9]);
				} catch (NumberFormatException e) {
					proteinesProduit = 0.0;
				}
				
				String[] tokensIngredients = tokens[4].split(",");
				String[] tokensAdditifs = tokens[28].split(",");
				String[] tokensAllergenes = tokens[29].split(",");
				
				for(String unIngredient : tokensIngredients) {
					ingredientsProduit.add(new Ingredient(unIngredient));
				}
				for(String unAdditif : tokensAdditifs) {
					additifsProduit.add(new Additif(unAdditif));
				}
				for(String unAllergene : tokensAllergenes) {
					allergenesProduit.add(new Allergene(unAllergene));
				}
				
				Produit produitToAdd = new Produit(categorieProduit, marqueProduit, gradeProduit, energieProduit, graisseProduit, sucresProduit, fibresProduit,
						proteinesProduit, ingredientsProduit, additifsProduit, allergenesProduit);
				if(listeProduitsFichier.size() == 0) {
					produitToAdd.resetId();
					produitToAdd.setId(0);
				}
				listeProduitsFichier.add(produitToAdd);
			}
		}
		
		this.tousLesProduits = listeProduitsFichier;
	}

	public List<Produit> getTousLesProduits() {
		return tousLesProduits;
	}

	public void setTousLesProduits(List<Produit> tousLesProduits) {
		this.tousLesProduits = tousLesProduits;
	}
	
	
}
