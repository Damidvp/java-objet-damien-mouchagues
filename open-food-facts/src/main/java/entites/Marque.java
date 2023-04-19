package entites;

public class Marque {
	private String libelle;

	public Marque(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Marque [libelle=" + libelle + "]";
	}
	
}
