package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> nbDe1A100 = new ArrayList<Integer>();
		for(int i=1; i<=100; i++) {
			nbDe1A100.add(i);
		}
		System.out.println("Taille du tableau : " + nbDe1A100.size());
	}

}
