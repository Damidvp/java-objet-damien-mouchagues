package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> tabPays = new HashSet<String>();
		tabPays.add("USA");
		tabPays.add("France");
		tabPays.add("Allemagne");
		tabPays.add("UK");
		tabPays.add("Italie");
		tabPays.add("Japon");
		tabPays.add("Chine");
		tabPays.add("Russie");
		tabPays.add("Inde");
		
		afficherListe(tabPays);
		
		int maxNbLettres = 0;
		String strAvecMaxNbLettres = "";
		for(String pays : tabPays) {
			if(pays.length() > maxNbLettres) {
				maxNbLettres = pays.length();
				strAvecMaxNbLettres = pays;
			}
		}
		System.out.println("Pays avec le plus de lettres (supprimé) : " + strAvecMaxNbLettres);
		tabPays.remove(strAvecMaxNbLettres);
		
		afficherListe(tabPays);
	}
	
	public static void afficherListe(HashSet<String> liste) {
		for(String element : liste) {
			System.out.println(element);
		}
	}

}
