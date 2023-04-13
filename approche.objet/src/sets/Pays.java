package sets;

public class Pays {
	
	private String nom;
	private int nbHabitants;
	private int pibParHabitant;
	
	public Pays(String nom, int nbHabitants, int pibParHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public int getPibParHabitant() {
		return pibParHabitant;
	}

	public void setPibParHabitant(int pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
	
	public String toString() {
		return this.nom + " - " + this.nbHabitants + " hab, PIB : " + this.pibParHabitant;
	}
	
	public long getPibTotal() {
		return (long) this.nbHabitants * this.pibParHabitant;
	}
	
}
