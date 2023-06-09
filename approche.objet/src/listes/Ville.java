package listes;

import fr.diginamic.testenumeration.Continent;

public class Ville {
	private String nom;
	private int nbHabitants;
	private Continent continent;

	public Ville(String nom, int nbHabitants, Continent continent) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
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

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return this.nom + " (" + this.nbHabitants + " habitants) [" + this.continent.getLibelle() + "]";
	}

	public boolean equals(Object object) {
		if(!(object instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville) object;
		return (this.nom.equals(autre.getNom()) && (this.nbHabitants == autre.getNbHabitants()));
	}
}
