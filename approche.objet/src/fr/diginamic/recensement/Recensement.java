package fr.diginamic.recensement;

import java.util.ArrayList;

public class Recensement {
	
	private ArrayList<Ville> recensementVilles;

	public Recensement(ArrayList<Ville> recensementVilles) {
		this.recensementVilles = recensementVilles;
	}

	public ArrayList<Ville> getRecensementVilles() {
		return recensementVilles;
	}

	public void setRecensementVilles(ArrayList<Ville> recensementVilles) {
		this.recensementVilles = recensementVilles;
	}
	
}
