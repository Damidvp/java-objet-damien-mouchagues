package fr.diginamic.salaire;

public abstract class Intervenant {
	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public abstract Double getSalaire();
	
	public void afficherDonnees() {
		System.out.println(this.prenom + " " + this.nom + " : " + this.getSalaire() + " €" + " (" +
				this.getClass().getSimpleName() + ")"); //this.getClass().getSimpleName() retourne le nom de la classe de l'instance actuelle
	}
	
}
