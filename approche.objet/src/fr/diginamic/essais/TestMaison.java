package fr.diginamic.essais;

import java.util.ArrayList;

import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {
		
		ArrayList<Piece> ensembleDePieces = new ArrayList<Piece>();
		ensembleDePieces.add(new Cuisine(9.0, 0));
		ensembleDePieces.add(new Salon(24.8, 0));
		ensembleDePieces.add(new Chambre(12.0, 0));
		ensembleDePieces.add(new SalleDeBain(10.0, 0));
		ensembleDePieces.add(new Chambre(12.0, 1));
		ensembleDePieces.add(new Chambre(14.0, 1));
		ensembleDePieces.add(new SalleDeBain(7.0, 1));
		ensembleDePieces.add(new Wc(5.0, 1));
		
		Maison maSuperMaison = new Maison(ensembleDePieces);
		
		maSuperMaison.ajouterPiece(new Chambre(15.5, 1));
		System.out.println("+++ Ajout d'une chambre au premier étage");
		maSuperMaison.afficherToutesLesPieces();
		
		System.out.println("*** Superficie totale de la maison : " + maSuperMaison.getSuperficieTotale() + " m²");
		
		System.out.println("*** Superficie du RDC : " + maSuperMaison.getSuperficieEtage(0) + " m²");
		System.out.println("*** Superficie de l'étage 1 : " + maSuperMaison.getSuperficieEtage(1) + " m²");
		
		System.out.println("*** Superficie globale des salles de bain : " + maSuperMaison.getSuperficieGlobaleDe("SalleDeBain") + " m²");
		System.out.println("*** Nombre de chambres : " + maSuperMaison.getNombreDePieces("Chambre"));
		
		maSuperMaison.ajouterPiece(null);
		maSuperMaison.ajouterPiece(new Cuisine(-2.5, 0));
		maSuperMaison.ajouterPiece(new Cuisine(2.5, -1));
		maSuperMaison.ajouterPiece(new Cuisine(-2.5, -1));
	}

}
