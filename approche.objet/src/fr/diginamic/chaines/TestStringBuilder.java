package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		long codeBegins = System.currentTimeMillis();
		for(int i=1; i<=100000; i++) {
			stringBuilder.append(i);
		}
		long codeEnds = System.currentTimeMillis();
		System.out.println("Temps d'exécution en ms (StringBuilder) : " + (codeEnds - codeBegins));
		
		String simpleString = "";
		long longCodeBegins = System.currentTimeMillis();
		for(int i=1; i<=100000; i++) {
			simpleString += i;
		}
		long longCodeEnds = System.currentTimeMillis();
		System.out.println("Temps d'exécution en ms (String) : " + (longCodeEnds - longCodeBegins));
		
		/* Grosse différence de temps en effet... */
	}

}
