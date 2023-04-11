package entites;

import entites2.Personne;
import java.util.ArrayList;

public class TestPersonne {
	public static void main(String[] args) {
		Personne personne1 = new Personne("Marya", "Conduché", new AdressePostale(1, "rue Boussairolles", 34000, "Montpellier"));
		Personne personne2 = new Personne("Damien", "Mouchagues", new AdressePostale(81, "avenue de la Forêt", 33740, "Arès"));
		personne1.setNom("Mario");
		personne2.setAdresse(new AdressePostale(1, "rue Boussairolles", 34000, "Montpellier"));
		ArrayList<Personne> tabPersonnes = new ArrayList<Personne>();
		tabPersonnes.add(personne1);
		tabPersonnes.add(personne2);
		for(Personne unePersonne : tabPersonnes) {
			System.out.println(unePersonne.getNomEtPrenomEnMajuscules() + " - " + unePersonne.getAdresse().getNumeroDeRue() +
					" " + unePersonne.getAdresse().getLibelleRue() + " " + unePersonne.getAdresse().getCodePostal() + " " + unePersonne.getAdresse().getVille());
		}
		
	}
}
