package approche.objet.entites;

public class TestPersonne {
	public static void main(String[] args) {
		Personne personne1 = new Personne("Marya", "Conduché", new AdressePostale(1, "rue Boussairolles", 34000, "Montpellier"));
		Personne personne2 = new Personne("Damien", "Mouchagues", new AdressePostale(81, "avenue de la Forêt", 33740, "Arès"));
	}
}
