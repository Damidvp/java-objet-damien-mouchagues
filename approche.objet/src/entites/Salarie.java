package entites;

public class Salarie {
	
	private String nom;
	private String prenom;
	private Double salaire;
	
	public Salarie(String nom, String prenom, Double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
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

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Salarie [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
	
}
