package tri;

public class Ville {
	
	private String nom;
	private int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return this.nom + " (" + this.nbHabitants + " habitants)";
	}
	
	/*
	//Tri sur le nom
	@Override
	public int compareTo(Ville o) {
		int result = this.nom.compareTo(o.getNom());
		return result;
	}
	*/
	
	/*
	//Tri sur le nb d'habitants
	@Override
	public int compareTo(Ville o) {
		int result = 0;
		if(this.nbHabitants > o.getNbHabitants()) {
			result = 1;
		}
		if(this.nbHabitants < o.getNbHabitants()) {
			result = -1;
		}
		return result;
	}
	*/
	
}
