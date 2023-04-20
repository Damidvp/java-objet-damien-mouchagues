package swing.elements;

import java.io.IOException;
import java.util.List;

import javax.swing.JTable;

import entites.Produit;
import entites.Stock;

public class TableProduits extends JTable{
	
	public TableProduits() throws IOException {
		super(getProduits(), getNomColonnes());
		setDefaultEditor(Object.class, null);
		setAutoCreateRowSorter(true);
	}
	
	public static String[] getNomColonnes() {
		String[] nomColonnes = {"Catégorie", "Marque", "Grade", "Energie 100g", "Graisse 100g", "Sucres 100g", "Fibres 100g", "Protéines 100g", "Ingrédients", "Additifs", "Allergènes"};
		return nomColonnes;
	}
	
	public static Object[][] getProduits() throws IOException{
		Stock leStock = new Stock();
		List<Produit> tousLesProduits = leStock.getTousLesProduits();
		
		Object[][] dataProduits = new Object[tousLesProduits.size()][11];
		for(int i=0; i<tousLesProduits.size(); i++) {
			dataProduits[i][0] = tousLesProduits.get(i).getCategorie().getLibelle();
			dataProduits[i][1] = tousLesProduits.get(i).getMarque().getLibelle();
			dataProduits[i][2] = tousLesProduits.get(i).getGrade().toString().toUpperCase();
			dataProduits[i][3] = tousLesProduits.get(i).getEnergie100g();
			dataProduits[i][4] = tousLesProduits.get(i).getGraisse100g();
			dataProduits[i][5] = tousLesProduits.get(i).getSucres100g();
			dataProduits[i][6] = tousLesProduits.get(i).getFibres100g();
			dataProduits[i][7] = tousLesProduits.get(i).getProteines100g();
			dataProduits[i][8] = tousLesProduits.get(i).getListeIngredients().size();
			dataProduits[i][9] = tousLesProduits.get(i).getListeAdditifs().size();
			dataProduits[i][10] = tousLesProduits.get(i).getListeAllergenes().size();
		}
		return dataProduits;
	}
	
}
