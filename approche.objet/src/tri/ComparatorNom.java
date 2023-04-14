package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville>{

	@Override
	public int compare(Ville o1, Ville o2) {
		int result = o1.getNom().compareTo(o2.getNom());
		return result;
	}

}
