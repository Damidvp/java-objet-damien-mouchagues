package com.testspring.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "kanji")
public class Kanji {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "idKanji")
	private String idKanji;
	@Column(name = "nbTraits")
	private int nbTraits;
	@Column(name = "niveau")
	private String niveau;
	
	public Kanji() {
		
	}
	
	public Kanji(String idKanji, int nbTraits, String niveau) {
		this.idKanji = idKanji;
		this.nbTraits = nbTraits;
		this.niveau = niveau;
	}
	
	public String getIdKanji() {
		return idKanji;
	}
	
	public void setIdKanji(String idKanji) {
		this.idKanji = idKanji;
	}
	
	public int getNbTraits() {
		return nbTraits;
	}
	
	public void setNbTraits(int nbTraits) {
		this.nbTraits = nbTraits;
	}
	
	public String getNiveau() {
		return niveau;
	}
	
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Kanji [idKanji=" + idKanji + ", nbTraits=" + nbTraits + ", niveau=" + niveau + "]";
	}
	
}
