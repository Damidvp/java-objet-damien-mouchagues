package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
	
	private ArrayList<Piece> toutesLesPieces;
	
	public Maison(ArrayList<Piece> toutesLesPieces) {
		this.toutesLesPieces = toutesLesPieces;
	}

	public ArrayList<Piece> getToutesLesPieces() {
		return toutesLesPieces;
	}

	public void setToutesLesPieces(ArrayList<Piece> toutesLesPieces) {
		this.toutesLesPieces = toutesLesPieces;
	}
	
	public void ajouterPiece(Piece unePiece) {
		if(unePiece != null) {
			if((unePiece.getSuperficie() > 0) && (unePiece.getEtage() > 0)) {
				this.toutesLesPieces.add(unePiece);
			} else {
				System.out.println("Erreur : le pièce que vous ajoutez contient des valeurs non valides");
			}
			
		} else {
			System.out.println("Erreur : la pièce que vous ajoutez est nulle");
		}
		
	}
	
	public void afficherToutesLesPieces() {
		for(Piece unePiece : toutesLesPieces) {
			System.out.println(unePiece.getClass().getSimpleName() + " (" + unePiece.getSuperficie() +" m², étage " 
					+ unePiece.getEtage() +")");
		}
	} 
	
	public Double getSuperficieTotale() {
		Double superficieTotale = 0.0;
		for(Piece unePiece : toutesLesPieces) {
			superficieTotale += unePiece.getSuperficie();
		}
		return superficieTotale;
	}
	
	public Double getSuperficieEtage(int unEtage) {
		Double superficieEtage = 0.0;
		for(Piece unePiece : toutesLesPieces) {
			if(unePiece.getEtage() == unEtage) {
				superficieEtage += unePiece.getSuperficie();
			}
		}
		return superficieEtage;
	}
	
	public Double getSuperficieGlobaleDe(String typeDePiece) {
		Double superficieGlobale = 0.0;
		for(Piece unePieceDuTab : toutesLesPieces) {
			if(typeDePiece.equals(unePieceDuTab.getClass().getSimpleName())) {
				superficieGlobale += unePieceDuTab.getSuperficie();
			}
		}
		return superficieGlobale;
	}
	
	public int getNombreDePieces(String typeDePiece) {
		int nbDePieces = 0;
		for(Piece unePiece : toutesLesPieces) {
			if(typeDePiece.equals(unePiece.getClass().getSimpleName())) {
				nbDePieces++;
			}
		}
		return nbDePieces;
	}
}
