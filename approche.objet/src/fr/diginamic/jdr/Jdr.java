package fr.diginamic.jdr;

import java.util.Scanner;

public class Jdr {

	public static void main(String[] args) {
		boolean continueToPlay = true;
		Personnage monPersonnage = new Personnage();
		monPersonnage.afficherPersonnage();
		while(continueToPlay) {
			Scanner scanner = new Scanner(System.in);
			boolean choiceToContinueValide = false;
			while(!choiceToContinueValide) {
				afficherMenu();
				switch(scanner.nextLine()) {
					case "1":
						choiceToContinueValide = true;
						monPersonnage = new Personnage();
						System.out.println("--- NOUVEAU PERSONNAGE ---");
						monPersonnage.afficherPersonnage();
						break;
					case "2":
						if(monPersonnage.getPv() > 0) {
							choiceToContinueValide = true;
							play(monPersonnage);
						} else {
							System.out.println("Votre personnage est décédé. Votre score final est de " + monPersonnage.getScore() +
									" points. Merci de créer un nouveau personnage.");
							System.out.println();
						}
						break;
					case "3":
						afficherScore(monPersonnage);
						break;
					case "4":
						choiceToContinueValide = true;
						continueToPlay = false;
						System.out.println("*** Vous quittez le jeu, au revoir ! ***");
						break;
					default:
						System.out.println("Erreur : saisie non valide");
						break;
				}
			}
		}
	}
	
	public static void play(Personnage personnage) {
		
		//Le jeu continue tant que le personnage a des pv
		Scanner scanner = new Scanner(System.in);
		boolean ennemiChoisiValide = false;
		Creature ennemi = null;
		while(!ennemiChoisiValide) {
			System.out.println("Choisissez une créature à combattre (1: Loup, 2: Gobelin, 3: Troll, 4: Bahamut) : ");
			switch(scanner.nextLine()) {
			case "1":
				ennemi = new Loup();
				ennemiChoisiValide = true;
				System.out.println();
				break;
			case "2":
				ennemi = new Gobelin();
				ennemiChoisiValide = true;
				System.out.println();
				break;
			case "3":
				ennemi = new Troll();
				ennemiChoisiValide = true;
				System.out.println();
				break;
			case "4":
				ennemi = new Bahamut();
				ennemiChoisiValide = true;
				System.out.println();
				break;
			default:
				System.out.println("Erreur : valeur entrée non valide");
			}
		}
		System.out.println("*** DEBUT DU COMBAT ***");
		System.out.println();
		int numTour = 1;
		while((ennemi.getPv() > 0) && (personnage.getPv() > 0)) {
			System.out.println("--- Tour " + numTour + " ---");
			tour(ennemi, personnage);
			numTour++;
		}
		System.out.println("*** FIN DU COMBAT ***");
		if(ennemi.getPv() <= 0) {
			System.out.println("!!! Créature vaincue (+" + getScoreGagne(ennemi) + " points) !!!");
			System.out.println();
			personnage.setScore(personnage.getScore() + getScoreGagne(ennemi));
		}
		if(personnage.getPv() <= 0) {
			System.out.println("!!! Vous avez été vaincu !!!");
			System.out.println();
		}
	}
	
	public static void tour(Creature uneCreature, Personnage unPersonnage) {
		int attaqueCreature = uneCreature.getAttaque();
		int attaquePersonnage = unPersonnage.getAttaque();
		System.out.println("Vous : " + unPersonnage.getPv() + " HP / Ennemi : " + uneCreature.getPv() + " HP");
		if(attaqueCreature > attaquePersonnage) {
			System.out.println("La créature vous inflige " + attaqueCreature + " points de dégats");
			unPersonnage.setPv(unPersonnage.getPv() - attaqueCreature);
		} else if (attaqueCreature < attaquePersonnage) {
			System.out.println("Vous infligez " + attaquePersonnage + " points de dégats à la créature");
			uneCreature.setPv(uneCreature.getPv() - attaquePersonnage);
		} else {
			System.out.println("La créature a paré votre attaque (égalité) !");
		}
		System.out.println();
	}
	
	public static int getScoreGagne(Creature uneCreature) {
		int score = 0;
		switch(uneCreature.getClass().getSimpleName()) {
			case "Loup":
				score = 1;
				break;
			case "Gobelin":
				score = 2;
				break;
			case "Troll":
				score = 5;
				break;
		}
		return score;
	}
	
	public static void afficherScore(Personnage unPersonnage) {
		System.out.println("Votre score actuel : " + unPersonnage.getScore());
		System.out.println();
	}
	
	public static void afficherMenu() {
		System.out.println("*** MENU ***");
		System.out.println("1. Créer un nouveau personnage");
		System.out.println("2. Combattre une créature");
		System.out.println("3. Afficher votre score actuel");
		System.out.println("4. Quitter");
		System.out.println();
	}

}
