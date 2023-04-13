package fr.diginamic.essais;

import java.text.DecimalFormat;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		Double[] tabDeNotes = new Double[15];
		Double minRandom = 0.0;
		Double maxRandom = 20.0;
		
		DecimalFormat decimalFormat = new DecimalFormat("0.00"); //Formatte un double pour afficher deux chiffres après la virgule

		for(int i=0; i<tabDeNotes.length; i++) {
			tabDeNotes[i] = (Math.random() * maxRandom) + minRandom;
		}
		
		CalculMoyenne calcMoyenne = new CalculMoyenne(tabDeNotes);
		
		//Test affichage
		System.out.println("Tableau initial de notes (moyenne : " + decimalFormat.format(calcMoyenne.calculMoyenne()) + ")");
		calcMoyenne.afficherTableau();
		
		//Test 1
		System.out.println("+++ Ajout d'une note 18.5");
		calcMoyenne.ajout(18.5);
		System.out.println("Nouveau tableau de notes (moyenne : " + decimalFormat.format(calcMoyenne.calculMoyenne()) + ")");
		calcMoyenne.afficherTableau();
		
		//Test 2
		System.out.println("+++ Ajout d'une note 2.75 et 1.25");
		calcMoyenne.ajout(2.75);
		calcMoyenne.ajout(1.25);
		System.out.println("Nouveau tableau de notes (moyenne : " + decimalFormat.format(calcMoyenne.calculMoyenne()) + ")");
		calcMoyenne.afficherTableau();
	}

}
