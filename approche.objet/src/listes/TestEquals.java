package listes;

import fr.diginamic.testenumeration.Continent;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Montpellier", 400000, Continent.EUROPE);
		Ville ville2 = new Ville("Montpellier", 400000, Continent.EUROPE);
		
		System.out.println("ville1 equals ville2 : " + ville1.equals(ville2)); // == retourne false systématiquement -> on doit faire la comparaison sur tous les attributs
	}

}
