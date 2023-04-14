package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> arrayPays = new ArrayList<Pays>();
		arrayPays.add(new Pays("France", 65000000, "Europe"));
		arrayPays.add(new Pays("Allemagne", 80000000, "Europe"));
		arrayPays.add(new Pays("Belgique", 10000000, "Europe"));
		arrayPays.add(new Pays("Russie", 150000000, "Asie"));
		arrayPays.add(new Pays("Chine", 1400000000, "Asie"));
		arrayPays.add(new Pays("Indonésie", 220000000, "Océanie"));
		arrayPays.add(new Pays("Australie", 20000000, "Océanie"));
		
		HashMap<String, Integer> paysParContinent = getNbPaysParContinent(arrayPays);
		afficherMap(paysParContinent);
	}
	
	public static HashMap<String, Integer> getNbPaysParContinent(ArrayList<Pays> tabPays){
		HashMap<String, Integer> nbPaysParContinent = new HashMap<String, Integer>();
		for(Pays unPays : tabPays) {
			String continent = unPays.getContinent();
			if(!nbPaysParContinent.containsKey(continent)) {
				nbPaysParContinent.put(continent, 1);
			} else {
				nbPaysParContinent.put(continent, nbPaysParContinent.get(continent) + 1);
			}
		}
		
		return nbPaysParContinent;
	}
	
	public static void afficherMap(HashMap<String, Integer> uneMap) {
		for(String uneKey : uneMap.keySet()) {
			System.out.println(uneKey + " - " + uneMap.get(uneKey).toString());
		}
	}

}
