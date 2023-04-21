package swing.elements;

import java.io.IOException;

import javax.swing.JScrollPane;

public class ListeProduits extends JScrollPane{
	
	public ListeProduits(TableProduits uneTableProduits) throws IOException {
		super(uneTableProduits);
		setVisible(true);
		this.updateUI();
	}

}
