package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> hashSetDbl = new HashSet<Double>();
		hashSetDbl.add(1.5);
		hashSetDbl.add(8.25);
		hashSetDbl.add(-7.32);
		hashSetDbl.add(13.3);
		hashSetDbl.add(-12.45);
		hashSetDbl.add(48.5);
		hashSetDbl.add(0.01);
		
		System.out.println("Liste de doubles");
		afficherListe(hashSetDbl);
		
		Double max = 0.0;
		for(Double unDbl : hashSetDbl) {
			if(unDbl > max) {
				max = unDbl;
			}
		}
		System.out.println("Valeur max : " + max);
		
		Double min = 0.0;
		for(Double unDbl : hashSetDbl) {
			if(unDbl < min) {
				min = unDbl;
			}
		}
		System.out.println("Valeur min : " + min + " (supprimée)");
		hashSetDbl.remove(min);
		System.out.println("Nouvelle liste");
		afficherListe(hashSetDbl);
	}
	
	public static void afficherListe(HashSet<Double> uneListe) {
		for(Double unDbl : uneListe) {
			System.out.println(unDbl);
		}
	}

}
