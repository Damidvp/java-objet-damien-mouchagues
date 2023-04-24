package com.testspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testspring.controller.KanjiService;
import com.testspring.entites.Kanji;
import com.testspring.swing.MainWindow;

import jakarta.transaction.Transactional;

@SpringBootApplication(scanBasePackages= {"com.testspring.controller"})
public class JpaKanjiApplication implements CommandLineRunner{
	
	@Autowired
	private KanjiService kanjiService;
	
	public static void main(String[] args) {
		//new MainWindow(kanjiService);
		SpringApplication.run(JpaKanjiApplication.class, args);
	}
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		Iterable<Kanji> searchKanjis = kanjiService.listeKanji();
		for(Kanji unKanji : searchKanjis) {
			System.out.println(unKanji.toString());
		}
	}

}
