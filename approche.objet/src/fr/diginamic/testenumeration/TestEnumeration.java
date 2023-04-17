package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		for(Saison uneSaison : Saison.values()) {
			System.out.println(uneSaison);
		}
		
		System.out.println(Saison.valueOf("ETE").getLibelle());
		System.out.println(Saison.getSaison("Hiver"));
	}

}
