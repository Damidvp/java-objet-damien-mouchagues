package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.services.RechercherDepartementsPlusPeuples;
import fr.diginamic.recensement.services.RechercherPopulationDepartement;
import fr.diginamic.recensement.services.RechercherPopulationRegion;
import fr.diginamic.recensement.services.RechercherRegionsPlusPeuplees;
import fr.diginamic.recensement.services.RechercherTopVillesFrance;
import fr.diginamic.recensement.services.RechercherTopVillesParDepartement;
import fr.diginamic.recensement.services.RechercherTopVillesParRegion;
import fr.diginamic.recensement.services.RechercherVille;

public class Application {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Ville> arrayVilles = new ArrayList<Ville>();
		
		Path path = Paths.get("C:/dev-java/recensement-population.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		remplirArrayList(arrayVilles, lines);
		Recensement recensementVilles = new Recensement(arrayVilles);
		
		//MENU
		System.out.println("*** APPLI RECENSEMENT ***");
		
		boolean stayInApp = true;
		while(stayInApp) {
			Scanner scanner = new Scanner(System.in);
			afficherMenu();
			switch(scanner.nextLine()) {
				case "1":
					RechercherVille rechercheVille = new RechercherVille();
					rechercheVille.traiter(recensementVilles, scanner);
					break;
				case "2":
					RechercherPopulationDepartement recherchePopDepartement = new RechercherPopulationDepartement();
					recherchePopDepartement.traiter(recensementVilles, scanner);
					break;
				case "3":
					RechercherPopulationRegion recherchePopRegion = new RechercherPopulationRegion();
					recherchePopRegion.traiter(recensementVilles, scanner);
					break;
				case "4":
					RechercherRegionsPlusPeuplees rechercheTopRegions = new RechercherRegionsPlusPeuplees();
					rechercheTopRegions.traiter(recensementVilles, scanner);
					break;
				case "5":
					RechercherDepartementsPlusPeuples rechercheTopDepartements = new RechercherDepartementsPlusPeuples();
					rechercheTopDepartements.traiter(recensementVilles, scanner);
					break;
				case "6":
					RechercherTopVillesParDepartement rechercheTopVillesDepartement = new RechercherTopVillesParDepartement();
					rechercheTopVillesDepartement.traiter(recensementVilles, scanner);
					break;
				case "7":
					RechercherTopVillesParRegion rechercheTopVillesRegion = new RechercherTopVillesParRegion();
					rechercheTopVillesRegion.traiter(recensementVilles, scanner);
					break;
				case "8":
					RechercherTopVillesFrance rechercheTopVillesFrance = new RechercherTopVillesFrance();
					rechercheTopVillesFrance.traiter(recensementVilles, scanner);
					break;
				case "9":
					stayInApp = false;
					System.out.println("*** Vous quittez l'application, au revoir ! ***");
					break;
				default:
					System.out.println("Erreur : veuillez saisir un menu valide");
					break;
			}
		}
	}
	
	public static void remplirArrayList(ArrayList<Ville> tab, List<String> liste) {
		for(String uneLigne : liste) {
			if(liste.indexOf(uneLigne) > 0) {
				String[] tokens = uneLigne.split(";");
				Region regionVille = new Region(Integer.parseInt(tokens[0]), tokens[1]);
				Departement departVille = new Departement(tokens[2]);
				int codeCommune = Integer.parseInt(tokens[5]);
				String nomCommune = tokens[6];
				int population = Integer.parseInt(tokens[9].replace(" ", ""));
				tab.add(new Ville(regionVille, departVille, codeCommune, nomCommune, population));
			}
		}
	}
	
	public static void afficherMenu() {
		System.out.println("1. Rechercher une ville");
		System.out.println("2. Rechercher la population d'un département");
		System.out.println("3. Rechercher la population d'une région");
		System.out.println("4. Afficher les 10 régions les plus peuplées");
		System.out.println("5. Afficher les 10 départements les plus peuplés");
		System.out.println("6. Rechercher les 10 villes les plus peuplées d'un département");
		System.out.println("7. Rechercher les 10 villes les plus peuplées d'une région");
		System.out.println("8. Afficher les 10 villes les plus peuplées de France");
		System.out.println("9. Quitter");
	}

}
