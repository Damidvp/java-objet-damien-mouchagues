package swing.elements;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopUpTable extends JPopupMenu{
	
	public PopUpTable() {
		super();
		JMenuItem menuIngredients = new JMenuItem("Afficher les ingrédients...");
		JMenuItem menuAdditifs = new JMenuItem("Afficher les additifs...");
		JMenuItem menuAllergenes = new JMenuItem("Afficher les allergenes...");
		
		add(menuIngredients);
		add(menuAdditifs);
		add(menuAllergenes);
	}
	
}
