package fr.diginamic.recensement;

public class Ville {
	
	private Region regionVille;
	private Departement departementVille;
	private int codeCommune;
	private String nomCommune;
	private int populationTotale;
	
	public Ville(Region regionVille, Departement departementVille, int codeCommune, String nomCommune,
			int populationTotale) {
		this.regionVille = regionVille;
		this.departementVille = departementVille;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	
	public Region getRegionVille() {
		return regionVille;
	}
	
	public void setRegionVille(Region regionVille) {
		this.regionVille = regionVille;
	}
	
	public Departement getDepartementVille() {
		return departementVille;
	}
	
	public void setDepartementVille(Departement departementVille) {
		this.departementVille = departementVille;
	}
	
	public int getCodeCommune() {
		return codeCommune;
	}
	
	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}
	
	public String getNomCommune() {
		return nomCommune;
	}
	
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}
	
	public int getPopulationTotale() {
		return populationTotale;
	}
	
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	public String toString() {
		return this.codeCommune + " " + this.nomCommune + " (" + this.populationTotale + " habitants) | Departement " + 
				this.departementVille.getCodeDepartement() + " | " + this.regionVille.getNomRegion() + " (" +
				this.regionVille.getCodeRegion() + ")";
	}
	
}
