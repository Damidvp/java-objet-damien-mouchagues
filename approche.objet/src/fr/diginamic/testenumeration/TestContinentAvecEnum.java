package fr.diginamic.testenumeration;

import java.util.ArrayList;

import listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<Ville>();
		
		villes.add(new Ville("New York", 8468000, Continent.AMERIQUE));
		villes.add(new Ville("Paris", 2161000, Continent.EUROPE));
		villes.add(new Ville("Pékin", 21540000, Continent.ASIE));
		villes.add(new Ville("Moscou", 11980000, Continent.EUROPE));
		villes.add(new Ville("Berlin", 3645000, Continent.EUROPE));
		villes.add(new Ville("Sydney", 5312000, Continent.OCEANIE));
		villes.add(new Ville("Sao Paulo", 12330000, Continent.AMERIQUE));
		villes.add(new Ville("Dakar", 1146000, Continent.AFRIQUE));
		
		afficherVilles(villes);
	}
	
	public static void afficherVilles(ArrayList<Ville> villes) {
		for(Ville uneVille : villes) {
			System.out.println(uneVille.toString());
		}
	}

}
