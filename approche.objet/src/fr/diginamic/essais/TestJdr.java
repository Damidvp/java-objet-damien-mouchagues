package fr.diginamic.essais;

import fr.diginamic.jdr.*;

public class TestJdr {

	public static void main(String[] args) {
		Personnage arnoCamoa = new Personnage();
		System.out.println("*** NOUVEAU PERSONNAGE ***");
		System.out.println("Force : " + arnoCamoa.getForce());
		System.out.println("Vie : " + arnoCamoa.getPv());
		System.out.println("Score : " + arnoCamoa.getScore());
		
		Creature unLoup = new Loup();
		Creature unGobelin = new Gobelin();
		Creature unTroll = new Troll();
		
		unLoup.afficherInfosCreature();
		unGobelin.afficherInfosCreature();
		unTroll.afficherInfosCreature();
		
		System.out.println("Une attaque du perso : " + arnoCamoa.getAttaque());
		System.out.println("Une attaque du loup : " + unLoup.getAttaque());
		System.out.println("Une attaque du gobelin : " + unGobelin.getAttaque());
		System.out.println("Une attaque du troll : " + unTroll.getAttaque());
	}

}
