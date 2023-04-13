package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie unSalarie = new Salarie("Conduché", "Marya", 1853.51);
		Pigiste unPigiste = new Pigiste("Mouchagues", "Damien", 15, 203.65);
		
		System.out.println("Salaire de " + unSalarie.getPrenom() + " " + unSalarie.getNom() + " : " +
				unSalarie.getSalaire() + " €");
		System.out.println("Salaire de " + unPigiste.getPrenom() + " " + unPigiste.getNom() + " : " +
				unPigiste.getSalaire() + " €");
		
		unSalarie.afficherDonnees();
		unPigiste.afficherDonnees();
	}

}
