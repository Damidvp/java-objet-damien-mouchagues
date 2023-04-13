package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre unTheatre = new Theatre("Le Théâtre de Sassie", 200, 100, 20000.0);
		
		System.out.println("--- Avant inscriptions ---");
		System.out.println("Total de clients inscrits : " + unTheatre.getTotalClientsInscrits());
		System.out.println("Recette totale : " + unTheatre.getRecetteTotale() + " €");
		
		unTheatre.inscrire(7, 15.5);
		unTheatre.inscrire(13, 8.9);
		unTheatre.inscrire(14, 10.1);
		unTheatre.inscrire(16, 14.6);
		unTheatre.inscrire(45, 6.4);
		
		//Clients de trop !
		unTheatre.inscrire(8, 20.3);
		
		System.out.println("--- Après inscriptions ---");
		System.out.println("Total de clients inscrits : " + unTheatre.getTotalClientsInscrits() + " (capacité : " + 
				unTheatre.getCapaciteMax() + ")");
		System.out.println("Recette totale : " + unTheatre.getRecetteTotale() + " €");
	}

}
