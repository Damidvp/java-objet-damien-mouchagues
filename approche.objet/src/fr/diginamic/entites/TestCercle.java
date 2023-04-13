package fr.diginamic.entites;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		//Cercle cercle1 = new Cercle(2.5);
		//Cercle cercle2 = new Cercle(4.0);
		Cercle cercle1 = CercleFactory.createCercle(2.5);
		Cercle cercle2 = CercleFactory.createCercle(4.0);
		System.out.println("Cercle 1 : " + cercle1.toString());
		System.out.println("Cercle 2 : " + cercle2.toString());
	}
}
