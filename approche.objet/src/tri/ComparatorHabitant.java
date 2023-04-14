package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		int result = 0;
		if(o1.getNbHabitants() > o2.getNbHabitants()) {
			result = 1;
		}
		if(o1.getNbHabitants() < o2.getNbHabitants()) {
			result = -1;
		}
		return result;
	}

}
