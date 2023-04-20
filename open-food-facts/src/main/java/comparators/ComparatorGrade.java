package comparators;

import java.util.Comparator;

import entites.Produit;

public class ComparatorGrade implements Comparator<Produit> {

	public int compare(Produit o1, Produit o2) {
		return o1.getGrade().compareTo(o2.getGrade());
	}

}
