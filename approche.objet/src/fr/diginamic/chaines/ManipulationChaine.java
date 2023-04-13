package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		System.out.println(chaine);
		
		char firstChar = chaine.charAt(0);
		System.out.println("Premier caractère : " + firstChar);
		
		System.out.println("Longueur de la chaîne : " + chaine.length());
		
		System.out.println("Position du premier ';' : " + chaine.indexOf(';'));
		
		String nomDeFamille = chaine.substring(0, chaine.indexOf(';'));
		System.out.println("Nom de famille : " + nomDeFamille);
		
		System.out.println("Nom de famille (majuscules) : " + nomDeFamille.toUpperCase());
		System.out.println("Nom de famille (minuscules) : " + nomDeFamille.toLowerCase());
		
		System.out.println("Découpage de la chaîne : ");
		String[] splitChaine = chaine.split(";");
		for(String elementChaine : splitChaine) {
			System.out.println(elementChaine);
		}
		
		Double salaireFormatte = Double.parseDouble(splitChaine[2].replace(" ", ""));
		Salarie unSalarie = new Salarie(splitChaine[0], splitChaine[1], salaireFormatte);
		System.out.println(unSalarie.toString());
	}

}
