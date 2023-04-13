package fr.diginamic.operations;

import java.text.DecimalFormat;

public class CalculMoyenne {
	private Double[] tabValeurs;

	public CalculMoyenne(Double[] tabValeurs) {
		this.tabValeurs = tabValeurs;
	}

	public Double[] getTabValeurs() {
		return tabValeurs;
	}

	public void setTabValeurs(Double[] tabValeurs) {
		this.tabValeurs = tabValeurs;
	}
	
	public void ajout(Double nouveauDouble) {
		int nouvelleTaille = this.tabValeurs.length + 1; //Nouvelle longueur du tableau
		Double[] nouveauTab = new Double[nouvelleTaille]; //Nouveau tableau à affecter
		//On ajoute dans le nouveau tableau les valeurs actuelles
		for(int i=0; i<this.tabValeurs.length; i++) {
			nouveauTab[i] = this.tabValeurs[i];
		}
		nouveauTab[nouvelleTaille-1] = nouveauDouble; //On affecte en dernière position du nouveau tableau le nouveau double
		this.tabValeurs = nouveauTab; //On remplace l'ancien tableau par le nouveau
	}
	
	public Double calculMoyenne() {
		Double sum = 0.0;
		for(Double valeur : this.tabValeurs) {
			sum += valeur;
		}
		return sum / this.tabValeurs.length;
	}
	
	public void afficherTableau() {
		DecimalFormat decimalFormat = new DecimalFormat("0.00"); //Formatte un double pour afficher deux chiffres après la virgule
		for(Double valeur : this.tabValeurs) {
			System.out.println(decimalFormat.format(valeur));
		}
	}
}
