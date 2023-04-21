package swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import swing.elements.ListeProduits;
import swing.elements.PanelFiltres;
import swing.elements.TableProduits;

public class MainWindow extends JFrame {

	public static void main(String[] args) throws IOException {
		JFrame fenetrePrincipale = new MainWindow();
	}
	
	public MainWindow() throws IOException {
		super("Open Food Facts");
		
		WindowListener exit = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		
		final PanelFiltres filtres = new PanelFiltres();
		final TableProduits produits = new TableProduits(filtres.getChamps()[0], filtres.getChamps()[1],
				filtres.getChamps()[2], filtres.getChamps()[3]);
		ListeProduits listeInitiale = new ListeProduits(produits);
		JButton rechercher = new JButton("Rechercher");
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints position = new GridBagConstraints();
		position.fill = GridBagConstraints.BOTH;
		
		position.weightx = 1;
		position.weighty = 1;
		position.insets = new Insets(0, 0, 0, 0);
		
		position.gridx = 0;
		position.gridy = 0;
		add(filtres, position);
		
		position.gridx = 0;
		position.gridy = 1;
		add(getPanelRechercher(rechercher), position);
		
		position.gridx = 0;
		position.gridy = 2;
		position.gridheight = 2;
		add(listeInitiale, position);
		
		rechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					produits.updateTable(filtres.getChamps());
					repaint();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		position.anchor = GridBagConstraints.CENTER;
		
		addWindowListener(exit);
		
		setSize(1200, 720);
		setLocationRelativeTo(null); //Centre la fenêtre sur l'écran
		setResizable(false);
		setVisible(true);
	}
	
	public JPanel getPanelRechercher(JButton button) {
		JPanel panel = new JPanel();
		
		panel.add(button);
		
		return panel;
	}

}
