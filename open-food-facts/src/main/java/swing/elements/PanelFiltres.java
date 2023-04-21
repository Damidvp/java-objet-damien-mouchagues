package swing.elements;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import swing.services.Categories;
import swing.services.Marques;

public class PanelFiltres extends JPanel {
	
	private JLabel labelRechGlobal = new JLabel("Rechercher :");
	private JTextField textRech = new JTextField(50);
	
	private JLabel labelRechCateg = new JLabel("Catégorie :");
	private JComboBox<String> listCategories = new JComboBox<String>();
	
	private JLabel labelRechMarq = new JLabel("Marque :");
	private JComboBox<String> listMarques = new JComboBox<String>();
	
	private JLabel labelRechGrade = new JLabel("Grade minimum : ");
	private JComboBox<String> listGrades = new JComboBox<String>();
	
	public PanelFiltres() throws IOException {
		super(new GridBagLayout());
		
		setBorder(new TitledBorder("Rechercher"));
		
		GridBagConstraints position = new GridBagConstraints();
		
		position.fill = GridBagConstraints.BOTH;
		position.anchor = GridBagConstraints.CENTER;
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
		
		textRech.setSize(30, 5);
		
		panel.add(labelRechGlobal);
		panel.add(textRech);
		
		return panel;
	}
	
	public JPanel getPanelRechercheCategorie() throws IOException {
		JPanel panel = new JPanel();
		
		listCategories.addItem("---");
		Categories categories = new Categories();
		for(int i=0; i<categories.getAllCategories().size(); i++) {
			listCategories.addItem(categories.getAllCategories().get(i));
		}
		
		panel.add(labelRechCateg);
		panel.add(listCategories);
		
		return panel;
	}
	
	public JPanel getPanelRechercheMarque() throws IOException {
		JPanel panel = new JPanel();
		
		listMarques.setSize(20, 3);
		listMarques.addItem("---");
		Marques marques = new Marques();
		for(int i=0; i<marques.getAllCategories().size(); i++) {
			listMarques.addItem(marques.getAllCategories().get(i));
		}
		
		panel.add(labelRechMarq);
		panel.add(listMarques);
		
		return panel;
	}
	
	public JPanel getPanelGrade() {
		JPanel panel = new JPanel();
		
		listGrades.addItem("F");
		listGrades.addItem("E");
		listGrades.addItem("D");
		listGrades.addItem("C");
		listGrades.addItem("B");
		listGrades.addItem("A");
		
		panel.add(labelRechGrade);
		panel.add(listGrades);
		
		return panel;
	}
	
	public String[] getChamps() {
		String[] stringRech = new String[4];
		stringRech[0] = textRech.getText().toString();
		stringRech[1] = listCategories.getSelectedItem().toString();
		stringRech[2] = listMarques.getSelectedItem().toString();
		stringRech[3] = listGrades.getSelectedItem().toString();
		return stringRech;
	}
}
