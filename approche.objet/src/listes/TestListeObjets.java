package listes;

import java.util.ArrayList;

import fr.diginamic.testenumeration.Continent;

public class TestListeObjets {

	public static void main(String[] args) {
		ArrayList<Ville> arrayVilles = new ArrayList<Ville>();
		
		arrayVilles.add(new Ville("Nice", 343000, Continent.EUROPE));
		arrayVilles.add(new Ville("Carcassonne", 47800, Continent.EUROPE));
		arrayVilles.add(new Ville("Narbonne", 53400, Continent.EUROPE));
		arrayVilles.add(new Ville("Lyon", 484000, Continent.EUROPE));
		arrayVilles.add(new Ville("Foix", 9700, Continent.EUROPE));
		arrayVilles.add(new Ville("Pau", 77200, Continent.EUROPE));
		arrayVilles.add(new Ville("Marseille", 850700, Continent.EUROPE));
		arrayVilles.add(new Ville("Tarbes", 40600, Continent.EUROPE));
		
		int maxHab = 0;
		Ville villeMaxHab = null;
		for(Ville uneVille : arrayVilles) {
			if(uneVille.getNbHabitants() > maxHab) {
				villeMaxHab = uneVille;
				maxHab = uneVille.getNbHabitants();
			}
		}
		System.out.println("Ville avec le + d'habitants : " + villeMaxHab.toString());
		
		int minHab = arrayVilles.get(0).getNbHabitants();
		Ville villeMinHab = null;
		for(Ville uneVille : arrayVilles) {
			if(uneVille.getNbHabitants() < minHab) {
				villeMinHab = uneVille;
				minHab = uneVille.getNbHabitants();
			}
		}
		System.out.println("Ville avec le - d'habitants : " + villeMinHab.toString() + " (supprimée)");
		arrayVilles.remove(villeMinHab);
		
		for(int i=0; i<arrayVilles.size(); i++) {
			if(arrayVilles.get(i).getNbHabitants() > 100000) {
				arrayVilles.get(i).setNom(arrayVilles.get(i).getNom().toUpperCase());
			}
		}
		
		System.out.println("Liste des villes (majuscules si +100000 habitants)");
		for(Ville uneVille : arrayVilles) {
			System.out.println(uneVille.toString());
		}
	}

}
