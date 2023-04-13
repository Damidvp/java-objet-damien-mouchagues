package fr.diginamic.operations;

public class Operations {
	
	public static Double calcul(Double a, Double b, char operateur) {
		Double resultat = 0.0;
		switch(operateur) {
			case '-':
				resultat = a-b;
				break;
			case '+':
				resultat = a+b;
				break;
			case '*':
				resultat = a*b;
				break;
			case '/':
				resultat = a/b;
				break;
		}
		return resultat;
	}
	
}
