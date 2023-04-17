package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RechercherVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Saisir le nom d'une ville : ");
		String villeRecherchee = scanner.nextLine();
		Ville villeTrouvee = null;
		for(Ville uneVille : recensement.getRecensementVilles()) {
			if(uneVille.getNomCommune().equals(villeRecherchee)) {
				villeTrouvee = uneVille;
			}
		}
		
		afficherResultat(villeTrouvee);
	}
	
	public static void afficherResultat(Ville ville) {
		if(ville != null) {
			System.out.println(ville.toString());
		} else {
			System.out.println("Aucun résultat trouvé");
		}
		System.out.println();
	}
}
