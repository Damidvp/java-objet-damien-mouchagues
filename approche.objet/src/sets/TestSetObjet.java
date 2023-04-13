package sets;

import java.util.HashSet;

public class TestSetObjet {

	public static void main(String[] args) {
		HashSet<Pays> tabPays = new HashSet<Pays>();
		tabPays.add(new Pays("USA", 336997624, 59495));
		tabPays.add(new Pays("France", 64531444, 43551));
		tabPays.add(new Pays("Allemagne", 83408554, 50206));
		tabPays.add(new Pays("UK", 67281039, 43620));
		tabPays.add(new Pays("Italie", 59240329, 37970));
		tabPays.add(new Pays("Japon", 124612530, 42659));
		tabPays.add(new Pays("Chine", 1425893465, 16624));
		tabPays.add(new Pays("Russie", 145102755, 28712));
		tabPays.add(new Pays("Inde", 1407563842, 5174));
		
		afficherListe(tabPays);
		
		int pibMax = 0;
		Pays paysAvecPibMax = null;
		for(Pays pays : tabPays) {
			if(pays.getPibParHabitant() > pibMax) {
				pibMax = pays.getPibParHabitant();
				paysAvecPibMax = pays;
			}
		}
		System.out.println("Pays avec PIB/hab le plus important : " + paysAvecPibMax.toString());
		
		long pibTotalMax = 0;
		Pays paysAvecPibTotalMax = null;
		for(Pays pays : tabPays) {
			if(pays.getPibTotal() > pibTotalMax) {
				pibTotalMax = pays.getPibTotal();
				paysAvecPibTotalMax = pays;
			}
		}
		System.out.println("Pays avec PIB total le plus important : " + paysAvecPibTotalMax.toString());
		
		long pibTotalMin = paysAvecPibTotalMax.getPibTotal();
		Pays paysAvecPibTotalMin = paysAvecPibTotalMax;
		for(Pays pays : tabPays) {
			if(pays.getPibTotal() < pibTotalMin) {
				pibTotalMin = pays.getPibTotal();
				paysAvecPibTotalMin = pays;
			}
		}
		paysAvecPibTotalMin.setNom(paysAvecPibTotalMin.getNom().toUpperCase());
		afficherListe(tabPays);
		tabPays.remove(paysAvecPibTotalMin);
		afficherListe(tabPays);
		
	}
	
	public static void afficherListe(HashSet<Pays> liste) {
		for(Pays element : liste) {
			System.out.println(element.toString());
		}
		System.out.println();
	}

}
