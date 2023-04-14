package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> arrayStr = new ArrayList<String>();
		arrayStr.add("Nice");
		arrayStr.add("Carcassonne");
		arrayStr.add("Narbonne");
		arrayStr.add("Lyon");
		arrayStr.add("Foix");
		arrayStr.add("Pau");
		arrayStr.add("Marseille");
		arrayStr.add("Tarbes");
		
		System.out.println("Liste initiale");
		for(String unStr : arrayStr) {
			System.out.println(unStr);
		}
		
		int nbLetters = 0;
		String villeMaxLetters = "";
		for(String unStr : arrayStr) {
			if(nbLetters < unStr.length()) {
				nbLetters = unStr.length();
				villeMaxLetters = unStr;
			}
		}
		System.out.println("Ville avec le plus de lettres : " + villeMaxLetters);
		
		System.out.println("Villes en MAJUSCULES");
		for(String unStr : arrayStr) {
			System.out.println(unStr.toUpperCase());
		}
		
		System.out.println("Villes ne commencant pas par 'N'");
		Iterator<String> iterator = arrayStr.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			if(element.charAt(0) == 'N') {
				iterator.remove();
			}
		}
		for(String unStr : arrayStr) {
			System.out.println(unStr);
		}
		
	}

}
