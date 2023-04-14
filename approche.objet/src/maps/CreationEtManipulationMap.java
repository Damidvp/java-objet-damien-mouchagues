package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles= new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		afficherKeysOfMap(mapVilles);
		afficherValuesOfMap(mapVilles);
		System.out.println("Taille de la Hashmap : " + mapVilles.size());
	}

	public static void afficherKeysOfMap(HashMap<Integer, String> uneHashMap) {
		System.out.println("Keys de la Hashmap :");
		for(Integer uneKey : uneHashMap.keySet()) { //.keySet retourne un set des keys de la HashMap
			System.out.println(uneKey);
		}
	}
	
	public static void afficherValuesOfMap(HashMap<Integer, String> uneHashMap) {
		System.out.println("Values de la Hashmap :");
		for(Integer uneKey : uneHashMap.keySet()) {
			System.out.println(uneHashMap.get(uneKey));
		}
	}
	
}
