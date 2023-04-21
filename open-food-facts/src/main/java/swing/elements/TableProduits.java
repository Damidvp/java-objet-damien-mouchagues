package swing.elements;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entites.Produit;
import entites.Stock;

public class TableProduits extends JTable{
	
	public TableProduits(String recherche, String categorie, String marque, String grade) throws IOException {
		super();
		DefaultTableModel modelInitial = new DefaultTableModel(getNomColonnes(), 0);
		for(Object[] uneLigne : getProduitsRecherches(recherche, categorie, marque, grade)) {
			modelInitial.addRow(uneLigne);
		}
		
		setModel(modelInitial);
		modelInitial.fireTableDataChanged();
		
		setDefaultEditor(Object.class, null);
		setAutoCreateRowSorter(true);
		
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Point point = e.getPoint();
				int currentRow = rowAtPoint(point);
				setRowSelectionInterval(currentRow, currentRow);
				try {
					PopUpTable popup = new PopUpTable(getProduitBySelection(currentRow));
					setComponentPopupMenu(popup);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
	}
	
	public static String[] getNomColonnes() {
		String[] nomColonnes = {"ID", "Catégorie", "Marque", "Grade", "Energie 100g", "Graisse 100g", "Sucres 100g", "Fibres 100g", "Protéines 100g", "Ingrédients", "Additifs", "Allergènes"};
		return nomColonnes;
	}
	
	public static ArrayList<Object[]> getProduits() throws IOException{
		Stock leStock = new Stock();
		List<Produit> tousLesProduits = leStock.getTousLesProduits();
		
		ArrayList<Object[]> rows = new ArrayList<Object[]>();
		
		for(int i=0; i<tousLesProduits.size(); i++) {
			Object[] dataProduits = new Object[12];
			dataProduits[0] = tousLesProduits.get(i).getId();
			dataProduits[1] = tousLesProduits.get(i).getCategorie().getLibelle();
			dataProduits[2] = tousLesProduits.get(i).getMarque().getLibelle();
			dataProduits[3] = tousLesProduits.get(i).getGrade().toString().toUpperCase();
			dataProduits[4] = tousLesProduits.get(i).getEnergie100g();
			dataProduits[5] = tousLesProduits.get(i).getGraisse100g();
			dataProduits[6] = tousLesProduits.get(i).getSucres100g();
			dataProduits[7] = tousLesProduits.get(i).getFibres100g();
			dataProduits[8] = tousLesProduits.get(i).getProteines100g();
			dataProduits[9] = tousLesProduits.get(i).getListeIngredients().size();
			dataProduits[10] = tousLesProduits.get(i).getListeAdditifs().size();
			dataProduits[11] = tousLesProduits.get(i).getListeAllergenes().size();
			rows.add(dataProduits);
		}
		return rows;
	}
	
	public static ArrayList<Object[]> getProduitsRecherches(String recherche, String categorie, String marque, String grade) throws IOException{
		if(recherche.equals("") && categorie.equals("---") && marque.equals("---") && grade.equals("F")) {
			return getProduits();
		} else {
			Stock leStock = new Stock();
			List<Produit> tousLesProduits = leStock.getTousLesProduits();
			
			ArrayList<Object[]> rows = new ArrayList<Object[]>();
			
			for(int i=0; i<tousLesProduits.size(); i++) {
				
				boolean equalsRecherche = tousLesProduits.get(i).getMarque().getLibelle().contains(recherche) ||
						tousLesProduits.get(i).getCategorie().getLibelle().contains(recherche);
				boolean equalsMarque = tousLesProduits.get(i).getMarque().getLibelle().contains(marque.replace("---", "")) ||
						tousLesProduits.get(i).getMarque().getLibelle().equals(marque);
				boolean equalsCategorie = tousLesProduits.get(i).getCategorie().getLibelle().contains(categorie.replace("---", "")) ||
						tousLesProduits.get(i).getCategorie().getLibelle().equals(categorie);
				boolean equalsGrade = tousLesProduits.get(i).getGrade() <= Character.toLowerCase(grade.charAt(0));
				
				Object[] dataProduits = new Object[12];
				if(equalsMarque && equalsCategorie && equalsRecherche && equalsGrade) {
					dataProduits[0] = tousLesProduits.get(i).getId();
					dataProduits[1] = tousLesProduits.get(i).getCategorie().getLibelle();
					dataProduits[2] = tousLesProduits.get(i).getMarque().getLibelle();
					dataProduits[3] = tousLesProduits.get(i).getGrade().toString().toUpperCase();
					dataProduits[4] = tousLesProduits.get(i).getEnergie100g();
					dataProduits[5] = tousLesProduits.get(i).getGraisse100g();
					dataProduits[6] = tousLesProduits.get(i).getSucres100g();
					dataProduits[7] = tousLesProduits.get(i).getFibres100g();
					dataProduits[8] = tousLesProduits.get(i).getProteines100g();
					dataProduits[9] = tousLesProduits.get(i).getListeIngredients().size();
					dataProduits[10] = tousLesProduits.get(i).getListeAdditifs().size();
					dataProduits[11] = tousLesProduits.get(i).getListeAllergenes().size();
					rows.add(dataProduits);
				}
			}
			return rows;
		}
		
	}
	
	public Produit getProduitBySelection(int rowSelected) throws IOException {
		Produit produitTrouve = null;
		
		Stock leStock = new Stock();
		List<Produit> tousLesProduits = leStock.getTousLesProduits();
		for(Produit unProduit : tousLesProduits) {
			if(Integer.parseInt(getValueAt(rowSelected, 0).toString()) == unProduit.getId()) {
				System.out.println("ID SELECTED : " + Integer.parseInt(getValueAt(rowSelected, 0).toString()));
				produitTrouve = unProduit;
				break;
			}
		}
		
		return produitTrouve;
	}
	
	public void updateTable(String[] params) throws IOException {

		DefaultTableModel newModel = new DefaultTableModel(getNomColonnes(), 0);
		for(Object[] uneLigne : getProduitsRecherches(params[0], params[1], params[2], params[3])) {
			newModel.addRow(uneLigne);
		}
	
		this.setModel(newModel);
		newModel.fireTableDataChanged();
	}
	
}
