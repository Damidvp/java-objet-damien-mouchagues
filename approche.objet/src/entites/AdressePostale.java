package entites;

public class AdressePostale {
	private int numeroDeRue;
	private String libelleRue;
	private int codePostal;
	private String ville;
	
	public AdressePostale(int numeroDeRue, String libelleRue, int codePostal, String ville) {
		this.numeroDeRue = numeroDeRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public int getNumeroDeRue() {
		return this.numeroDeRue;
	}
	
	public String getLibelleRue() {
		return this.libelleRue;
	}

	public int getCodePostal() {
		return this.codePostal;
	}

	public String getVille() {
		return this.ville;
	}
}
