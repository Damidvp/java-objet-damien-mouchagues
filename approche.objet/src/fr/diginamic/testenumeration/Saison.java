package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS(1, "Printemps"), ETE(2, "Eté"), AUTOMNE(3, "Automne"), HIVER(4, "Hiver");
	
	private int numero;
	private String libelle;
	
	private Saison(int numero, String libelle) {
		this.numero = numero;
		this.libelle = libelle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public static Saison getSaison(String libelle) {
		for(Saison uneSaison : values()) {
			if(uneSaison.libelle.equals(libelle)) {
				return uneSaison;
			}
		}
		return null;
	}
	
}
