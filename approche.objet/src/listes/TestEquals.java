package listes;

import fr.diginamic.testenumeration.Continent;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Montpellier", 400000, Continent.EUROPE);
		Ville ville2 = new Ville("Montpellier", 400000, Continent.EUROPE);

		System.out.println("ville1 equals ville2 : " + ville1.equals(ville2)); //Résultat redéfinition equels
		System.out.println("ville1 == ville2 : " + (ville1 == ville2)); //Identiques mais retourne false
	}

}
