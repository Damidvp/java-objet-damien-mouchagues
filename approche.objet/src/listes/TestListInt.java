package listes;

import java.util.ArrayList;

public class TestListInt {

	public static void main(String[] args) {
		ArrayList<Integer> arrayInt = new ArrayList<Integer>();
		arrayInt.add(-1);
		arrayInt.add(5);
		arrayInt.add(7);
		arrayInt.add(3);
		arrayInt.add(-2);
		arrayInt.add(4);
		arrayInt.add(8);
		arrayInt.add(5);
		
		System.out.println("Liste entiers (taille : " + arrayInt.size() + ")");
		for(Integer unInt : arrayInt) {
			System.out.println(unInt);
		}
		
		Integer max = 0;
		for(Integer unInt : arrayInt) {
			if(unInt > max) {
				max = unInt;
			}
		}
		System.out.println("Val max : " + max);
		
		//Si nombre négatif dans le tableau, le passe en positif (puis retour du nouveau tableau)
		System.out.println("Liste entiers sans nb négatifs");
		for(int i=0; i<arrayInt.size(); i++) {
			if(arrayInt.get(i) < 0) {
				arrayInt.set(i, arrayInt.get(i)*(-1));
			}
		}
		for(Integer unInt : arrayInt) {
			System.out.println(unInt);
		}
	}

}
