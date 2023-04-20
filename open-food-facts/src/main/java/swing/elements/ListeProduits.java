package swing.elements;

import java.io.IOException;

import javax.swing.JScrollPane;

public class ListeProduits extends JScrollPane{
	
	public ListeProduits() throws IOException {
		super(new TableProduits());
		this.setVisible(true);
	}
	
}
