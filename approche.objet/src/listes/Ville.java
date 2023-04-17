package listes;

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
	
	public boolean equals(Ville uneVille) {
		return (this.nom.equals(uneVille.getNom()) && this.nbHabitants == uneVille.getNbHabitants());
	}
}
