package com.testspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testspring.dao.KanjiDAO;
import com.testspring.entites.Kanji;

@Service
public class KanjiService {
	
	@Autowired
	private KanjiDAO kanjiDAO;

	public Iterable<Kanji> listeKanji() {
		return kanjiDAO.findAll();
	}
	
}
