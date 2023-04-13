package fr.diginamic.entites;

public class Theatre {
	
	private String nom;
	private int capaciteMax;
	private int totalClientsInscrits;
	private Double recetteTotale;
	
	public Theatre(String nom, int capaciteMax, int totalClientsInscrits, Double recetteTotale) {
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.totalClientsInscrits = totalClientsInscrits;
		this.recetteTotale = recetteTotale;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getTotalClientsInscrits() {
		return totalClientsInscrits;
	}

	public void setTotalClientsInscrits(int totalClientsInscrits) {
		this.totalClientsInscrits = totalClientsInscrits;
	}

	public Double getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(Double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}
	
	public void inscrire(int nbClients, Double prixPlace) {
		if((this.totalClientsInscrits + nbClients) < this.capaciteMax) {
			this.totalClientsInscrits += nbClients;
			this.recetteTotale += (prixPlace * nbClients);
			System.out.println(nbClients + " billets de " + prixPlace + " € enregistrés");
		} else {
			System.out.println("Erreur : capacité maximale atteinte");
		}
	}
	
}
