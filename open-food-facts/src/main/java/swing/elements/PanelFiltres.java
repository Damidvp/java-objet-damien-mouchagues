package swing.elements;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import swing.services.Categories;
import swing.services.Marques;

public class PanelFiltres extends JPanel {
	
	public PanelFiltres() throws IOException {
		super(new GridBagLayout());
		GridBagConstraints position = new GridBagConstraints();
		
		position.fill = GridBagConstraints.BOTH;
		position.anchor = GridBagConstraints.CENTER;
		position.insets = new Insets(15, 15, 30, 30);
		position.weightx = 2;
		position.weighty = 3;
		
		position.gridx = 0;
		position.gridy = 0;
		position.gridwidth = 2;
		this.add(getPanelRechercheGlobale(), position);
		
		position.gridx = 0;
		position.gridy = 1;
		position.gridwidth = 2;
		this.add(getPanelRechercheCategorie() , position);
		
		position.gridx = 0;
		position.gridy = 2;
		position.gridwidth = 1;
		this.add(getPanelRechercheMarque() , position);

		position.gridx = 1;
		position.gridy = 2;
		this.add(getPanelGrade(), position);
		
	}
	
	public JPanel getPanelRechercheGlobale() {
		JPanel panel = new JPanel();
		JLabel labelRech = new JLabel("Rechercher :");
		JTextField textRech = new JTextField(50);
		
		panel.add(labelRech);
		panel.add(textRech);
		
		return panel;
	}
	
	public JPanel getPanelRechercheCategorie() throws IOException {
		JPanel panel = new JPanel();
		JLabel labelRech = new JLabel("Catégorie :");
		JComboBox<String> listCategories = new JComboBox<String>();
		
		listCategories.addItem("---");
		Categories categories = new Categories();
		for(int i=0; i<categories.getAllCategories().size(); i++) {
			listCategories.addItem(categories.getAllCategories().get(i));
		}
		
		panel.add(labelRech);
		panel.add(listCategories);
		
		return panel;
	}
	
	public JPanel getPanelRechercheMarque() throws IOException {
		JPanel panel = new JPanel();
		JLabel labelRech = new JLabel("Marque :");
		JComboBox<String> listMarques = new JComboBox<String>();
		
		listMarques.setSize(20, 3);
		listMarques.addItem("---");
		Marques marques = new Marques();
		for(int i=0; i<marques.getAllCategories().size(); i++) {
			listMarques.addItem(marques.getAllCategories().get(i));
		}
		
		panel.add(labelRech);
		panel.add(listMarques);
		
		return panel;
	}
	
	public JPanel getPanelGrade() {
		JPanel panel = new JPanel();
		JLabel labelRech = new JLabel("Grade minimum : ");
		JComboBox<String> listGrades = new JComboBox<String>();
		
		listGrades.addItem("F");
		listGrades.addItem("E");
		listGrades.addItem("D");
		listGrades.addItem("C");
		listGrades.addItem("B");
		listGrades.addItem("A");
		
		panel.add(labelRech);
		panel.add(listGrades);
		
		return panel;
	}
}
