package entites;

//Les ArrayList permettent de gérer des tableaux à grandeur dynamique sur Java
import java.util.ArrayList;

public class TestAdressePostale {
	
	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale(1, "rue Boussairolles", 34000, "Montpellier");
		AdressePostale adresse2 = new AdressePostale(81, "avenue de la Forêt", 33740, "Arès");
		ArrayList<AdressePostale> tabAdresses = new ArrayList<AdressePostale>();
		tabAdresses.add(adresse1);
		tabAdresses.add(adresse2);
		for(AdressePostale uneAdresse : tabAdresses) {
			System.out.println(uneAdresse.getNumeroDeRue() + " " + uneAdresse.getLibelleRue() + " " +
					uneAdresse.getCodePostal() + " " + uneAdresse.getVille());
		}
	}
	
}
