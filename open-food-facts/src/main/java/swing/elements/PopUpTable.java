package swing.elements;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import entites.Produit;
import swing.popups.PopupAdditifs;
import swing.popups.PopupAllergenes;
import swing.popups.PopupIngredients;

public class PopUpTable extends JPopupMenu{
	
	public PopUpTable(final Produit PRODUIT) {
		super();
		JMenuItem menuIngredients = new JMenuItem("Afficher les ingrédients...");
		JMenuItem menuAdditifs = new JMenuItem("Afficher les additifs...");
		JMenuItem menuAllergenes = new JMenuItem("Afficher les allergenes...");
		
		menuIngredients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PopupIngredients(PRODUIT.getListeIngredients());
			}
		});
		
		menuAdditifs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PopupAdditifs(PRODUIT.getListeAdditifs());
			}
		});
		
		menuAllergenes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PopupAllergenes(PRODUIT.getListeAllergenes());
			}
		});
		
		add(menuIngredients);
		add(menuAdditifs);
		add(menuAllergenes);
	}
	
}
