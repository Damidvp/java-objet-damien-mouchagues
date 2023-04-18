package fr.diginamic.automates;

import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.automates.entites.Cellule;
import fr.diginamic.automates.entites.Grid;

public class JeuDeLaVie {

	public static void main(String[] args) {
		
		int gridWidth = 10;
		int gridHeight = 5;
		Cellule[][] cellulesInitiales = new Cellule[gridHeight][gridWidth];
		
		genererGenerationInitiale(gridWidth, gridHeight, cellulesInitiales);
		Grid gridInitial = new Grid(gridWidth, gridHeight, cellulesInitiales);
		
		System.out.println("*** JEU DE LA VIE ***");
		System.out.println();
		afficherGeneration(gridInitial);
		
		boolean stayInApp = true;
		Scanner scanner = new Scanner(System.in);
		
		while(stayInApp) {
			afficherMenu();
			String choix = scanner.nextLine();
			switch(choix) {
			case "1":
				evolutionGeneration(gridInitial);
				afficherGeneration(gridInitial);
				break;
			case "99":
				stayInApp = false;
				System.out.println("*** Vous quittez l'application, au revoir ! ***");
				break;
			default:
				System.out.println("Erreur : merci de saisir un menu valide");
				break;
			}
		}
	}
	
	public static void afficherGeneration(Grid ensembleCellules) {
		Cellule[][] cellules = ensembleCellules.getCellules();
		for(int i=0; i<ensembleCellules.getHeight(); i++) {
			String line = "|";
			for(int j=0; j<ensembleCellules.getWidth(); j++) {
				if(cellules[i][j].isDead()) {
					line += " ";
				} else {
					line += "X";
				}
				line += "|";
			}
			System.out.println(line);
		}
		System.out.println();
	}
	
	//Cette méthode permettra de modifier le Grid pour la génération suivante
	public static Cellule[][] evolutionGeneration(Grid ensembleCellules) {
		Cellule[][] cellules = new Cellule[ensembleCellules.getHeight()][ensembleCellules.getWidth()];
		ArrayList<Cellule> cellulesNaissantes = new ArrayList<Cellule>();
		ArrayList<Cellule> cellulesMourantes = new ArrayList<Cellule>();
		for(int i=0; i<ensembleCellules.getHeight(); i++) {
			for(int j=0; j<ensembleCellules.getWidth(); j++) {
				int nbCellulesAdjacentes = 0;
				
				
				
				boolean isDead = true;
				switch(nbCellulesAdjacentes) {
				case 2:
					isDead = false;
					break;
				case 3:
					if(ensembleCellules.getCellules()[i][j].isDead()) {
						
					}
					break;
				case 4, 5, 6, 7, 8:
					break;
				default:
					break;
				}
				
			}
		}
		return cellules;
	}
	
	public static void afficherMenu() {
		System.out.println("1. Générer et afficher la prochaine génération");
		System.out.println("99. Quitter");
	}
	
	public static void genererGenerationInitiale(int width, int height, Cellule[][] init) {
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				boolean isDead = true;
				switch(i) {
				case 0:
					switch(j) {
					case 2, 9:
						isDead = false;
						break;
					}
					break;
				case 1:
					switch(j) {
					case 6, 7:
						isDead = false;
						break;
					}
					break;
				case 2:
					switch(j) {
					case 3, 4:
						isDead = false;
						break;
					}
					break;
				case 3:
					switch(j) {
					case 3, 4:
						isDead = false;
						break;
					}
					break;
				case 4:
					switch(j) {
					case 7, 8:
						isDead = false;
						break;
					}
					break;
				}
				init[i][j] = new Cellule(i, j, isDead);
			}
		}
	}

}
