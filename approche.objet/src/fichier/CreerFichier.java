package fichier;

import java.io.IOException;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("C:/dev-java/recensement-population.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8).subList(1, 100); //Les 100 premières lignes
		
		File file = new File("C:/dev-java/recensement-population-100.csv");
		Path pathCible = Paths.get(file.getAbsolutePath());
		Files.write(pathCible, lines, StandardCharsets.UTF_8);
		
		System.out.println("Fichier créé !");
		afficherLignes(lines);
	}
	
	public static void afficherLignes(List<String> liste) {
		for(String uneLigne : liste) {
			System.out.println(uneLigne);
		}
	}

}
