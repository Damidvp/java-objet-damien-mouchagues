package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Carre;

public class TestForme {

	public static void main(String[] args) {
		Cercle unCercle = new Cercle(3.0);
		Rectangle unRectangle = new Rectangle(4.0, 10.0);
		Carre unCarre = new Carre(6.0);
		
		AffichageForme.afficher(unCercle);
		AffichageForme.afficher(unRectangle);
		AffichageForme.afficher(unCarre);
	}

}
