package utils;

public class TestMethodeStatic {
	
	public static void main(String[] args) {
		String chaine = "12";
		int chaineConvertie = Integer.parseInt(chaine);
		
		int minRandom = 1;
		int maxRandom = 100;
		
		int a = (int) (Math.random()*(maxRandom-minRandom+1)+minRandom);
		int b = (int) (Math.random()*(maxRandom-minRandom+1)+minRandom);
		
		System.out.println("Maximum entre " + a + " et " + b + " : " + Integer.max(a, b));
	}
	
}
