package com.testspring.swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import org.springframework.context.annotation.ComponentScan;

import com.testspring.controller.KanjiService;
import com.testspring.entites.Kanji;

import jakarta.transaction.Transactional;

@ComponentScan("com.testspring.controller")
public class MainWindow extends JFrame {
	
	private static final long serialVersionUID = -4722569078513421754L;
	
	public MainWindow(KanjiService kanjiService) {
		setVisible(true);
		setSize(1280, 720);
		setTitle("Kanji Battle sur JAVA");
		setLocationRelativeTo(null);
		setResizable(false);
		
		WindowListener exit = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		
		addWindowListener(exit);
		
		add(constructListOfKanji(kanjiService.listeKanji()));
	}
	
	@Transactional
	public JList<String> constructListOfKanji(Iterable<Kanji> kanjis) {
		JList<String> listeKanjis = new JList<String>();
		DefaultListModel<String> modelListe = new DefaultListModel<String>();
		listeKanjis.setModel(modelListe);
		StringBuilder strBuild = new StringBuilder();
		
		for(Kanji unKanji : kanjis) {
			strBuild.append(unKanji.getIdKanji())
			.append(" | ")
			.append(unKanji.getNbTraits())
			.append(" traits [")
			.append(unKanji.getNiveau())
			.append("]");
			modelListe.addElement(strBuild.toString());
		}
		
		return listeKanjis;
	}
	
}
