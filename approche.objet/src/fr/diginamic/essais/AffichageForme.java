package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	
	public static void afficher(Forme uneForme) {
		System.out.println("Périmètre : " + uneForme.calculerPerimetre() + " / Surface : " + uneForme.calculerSurface());
	}
	
}
