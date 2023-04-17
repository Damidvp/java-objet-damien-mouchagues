package listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Montpellier", 400000);
		Ville ville2 = new Ville("Montpellier", 400000);
		
		System.out.println("ville1 equals ville2 : " + ville1.equals(ville2)); // == retourne false systématiquement -> on doit faire la comparaison sur tous les attributs
	}

}
