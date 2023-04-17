package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorVille implements Comparator<Ville>{

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		if(o1.getPopulationTotale() < o2.getPopulationTotale()) {
			return 1;
		} else if (o1.getPopulationTotale() > o2.getPopulationTotale()) {
			return -1;
		}
		return 0;
	}

}
