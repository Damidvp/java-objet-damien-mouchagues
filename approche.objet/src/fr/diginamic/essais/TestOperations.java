package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		System.out.println("Resultat de 32 + 94 : " + Operations.calcul(32.0, 94.0, '+'));
		System.out.println("Resultat de 329 - 72 : " + Operations.calcul(329.0, 72.0, '-'));
		System.out.println("Resultat de 29 * 44 : " + Operations.calcul(29.0, 44.0, '*'));
		System.out.println("Resultat de 169 / 18 : " + Operations.calcul(169.0, 18.0, '/'));
	}

}
