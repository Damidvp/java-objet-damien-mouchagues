package swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JFrame;

import swing.elements.ListeProduits;

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
		add(new ListeProduits());
		addWindowListener(exit);
		setSize(1000, 800);
		setLocationRelativeTo(null); //Centre la fenêtre sur l'écran
		setVisible(true);
	}

}
