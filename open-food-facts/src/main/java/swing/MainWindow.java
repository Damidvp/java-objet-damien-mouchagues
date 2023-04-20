package swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JFrame;

import swing.elements.ListeProduits;
import swing.elements.PanelFiltres;

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
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints position = new GridBagConstraints();
		position.fill = GridBagConstraints.BOTH;
		position.anchor = GridBagConstraints.CENTER;
		position.weightx = 1;
		position.weighty = 3;
		
		position.gridx = 0;
		position.gridy = 0;
		add(new PanelFiltres(), position);
		
		position.gridy = 1;
		position.gridheight = 2;
		add(new ListeProduits(), position);
		
		addWindowListener(exit);
		
		setSize(1000, 800);
		setLocationRelativeTo(null); //Centre la fenêtre sur l'écran
		setResizable(false);
		setVisible(true);
	}

}
