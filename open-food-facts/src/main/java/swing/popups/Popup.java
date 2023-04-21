package swing.popups;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import entites.Additif;
import entites.Allergene;
import entites.Ingredient;

public class Popup extends JFrame{
	
	public Popup(ArrayList<?> array, String nomClasse) {
		super("Liste d'" + nomClasse.toLowerCase() + "s");
		
		setVisible(true);
		
		setSize(400, 600);
		setLocationRelativeTo(null); //Centre la fenêtre sur l'écran
		setResizable(false);
		setVisible(true);
		
		constructWindow(array, nomClasse);
	}
	
	public void constructWindow(ArrayList<?> array, String nomClasse) {
		JPanel panel = new JPanel();
		JLabel label = new JLabel(nomClasse + "s :");
		JList<String> listeElements = new JList<String>();
		
		listeElements = generateJList(array);
		
		panel.add(label);
		panel.add(listeElements);
		
		add(panel);
	}
	
	public JList<String> generateJList(ArrayList<?> array){
		DefaultListModel<String> modelListe = new DefaultListModel<String>();
		JList<String> listeIngredients = new JList<String>(modelListe);
		
		String arrayType = array.get(0).getClass().getSimpleName();
		System.out.println(arrayType);
		if(arrayType.equals("Ingredient")) {
			ArrayList<Ingredient> arrayIngredients = (ArrayList<Ingredient>) array;
			for(Ingredient unIngredient : arrayIngredients) {
				modelListe.addElement(unIngredient.getLibelle());
			}
		} else if(arrayType.equals("Additif")) {
			ArrayList<Additif> arrayAdditifs = (ArrayList<Additif>) array;
			for(Additif unAdditif : arrayAdditifs) {
				modelListe.addElement(unAdditif.getLibelle());
			}
		} else {
			ArrayList<Allergene> arrayAllergenes = (ArrayList<Allergene>) array;
			for(Allergene unAllergene : arrayAllergenes) {
				modelListe.addElement(unAllergene.getLibelle());
			}
		}
		
		return listeIngredients;
	};
	
}
