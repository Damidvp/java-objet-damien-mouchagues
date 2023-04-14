package tri;

import java.util.ArrayList;
import java.util.Collections;

public class TriVille {

	public static void main(String[] args) {
		ArrayList<Ville> arrayVilles = new ArrayList<Ville>();
		
		arrayVilles.add(new Ville("Nice", 343000));
		arrayVilles.add(new Ville("Carcassonne", 47800));
		arrayVilles.add(new Ville("Narbonne", 53400));
		arrayVilles.add(new Ville("Lyon", 484000));
		arrayVilles.add(new Ville("Foix", 9700));
		arrayVilles.add(new Ville("Pau", 77200));
		arrayVilles.add(new Ville("Marseille", 850700));
		arrayVilles.add(new Ville("Tarbes", 40600));
	
		afficherVilles(arrayVilles);
		
		Collections.sort(arrayVilles, new ComparatorNom());
		System.out.println("*** LISTE TRIEE PAR NOM ***");
		afficherVilles(arrayVilles);
		
		Collections.sort(arrayVilles, new ComparatorHabitant());
		System.out.println("*** LISTE TRIEE PAR HABITANTS ***");
		afficherVilles(arrayVilles);
	}

	public static void afficherVilles(ArrayList<Ville> tabVilles) {
		for(Ville uneVille : tabVilles) {
			System.out.println(uneVille.toString());
		}
		System.out.println();
	}
}
