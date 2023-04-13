package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

	private int nbJoursTravailles;
	private Double salaireJournalier;
	
	public Pigiste(String nom, String prenom, int nbJoursTravailles, Double salaireJournalier) {
		super(nom, prenom);
		this.nbJoursTravailles = nbJoursTravailles;
		this.salaireJournalier = salaireJournalier;
	}

	public int getNbJoursTravailles() {
		return nbJoursTravailles;
	}

	public void setNbJoursTravailles(int nbJoursTravailles) {
		this.nbJoursTravailles = nbJoursTravailles;
	}

	public Double getSalaireJournalier() {
		return salaireJournalier;
	}

	public void setSalaireJournalier(Double salaireJournalier) {
		this.salaireJournalier = salaireJournalier;
	}

	@Override
	public Double getSalaire() {
		return nbJoursTravailles * salaireJournalier;
	}
	
}
