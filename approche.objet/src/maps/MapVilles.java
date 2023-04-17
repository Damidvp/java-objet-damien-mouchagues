package maps;

import listes.Ville;
import java.util.HashMap;

import fr.diginamic.testenumeration.Continent;

public class MapVilles {

	public static void main(String[] args) {
		HashMap<String, Ville> mapVilles = new HashMap<String, Ville>();
		mapVilles.put("Nice", new Ville("Nice", 343000, Continent.EUROPE));
		mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800, Continent.EUROPE));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53400, Continent.EUROPE));
		mapVilles.put("Lyon", new Ville("Lyon", 484000, Continent.EUROPE));
		mapVilles.put("Foix", new Ville("Foix", 9700, Continent.EUROPE));
		mapVilles.put("Pau", new Ville("Pau", 77200, Continent.EUROPE));
		mapVilles.put("Marseille", new Ville("Marseille", 850700, Continent.EUROPE));
		mapVilles.put("Tarbes", new Ville("Tarbes", 40600, Continent.EUROPE));
		
		Ville villeToDelete = null;
		for(String uneKey : mapVilles.keySet()) {
			if(villeToDelete != null){
				if(villeToDelete.getNbHabitants() > mapVilles.get(uneKey).getNbHabitants()) {
					villeToDelete = mapVilles.get(uneKey);
				}
			} else {
				villeToDelete = mapVilles.get(uneKey);
			}
		}
		System.out.println("Ville à remove : " + villeToDelete.toString());
		mapVilles.remove(villeToDelete.getNom());
		afficherMap(mapVilles);
	}
	
	public static void afficherMap(HashMap<String, Ville> uneMap) {
		for(String uneKey : uneMap.keySet()) {
			System.out.println(uneKey + " - " + uneMap.get(uneKey).toString());
		}
	}

}
