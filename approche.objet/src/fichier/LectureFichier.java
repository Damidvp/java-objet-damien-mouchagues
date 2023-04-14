package fichier;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Ville> arrayVilles = new ArrayList<Ville>();
		
		Path path = Paths.get("C:/dev-java/recensement-population.csv");
		boolean fileExists = Files.exists(path);
		boolean fileIsRegular = Files.isRegularFile(path);
		boolean fileIsReadable = Files.isReadable(path);
		
		Path pathRep = Paths.get("C:/dev-java");
		boolean directoryIsFile = Files.isDirectory(pathRep);
		boolean directoryIsReadable = Files.isReadable(pathRep);
		
		System.out.println("File exists : " + fileExists);
		System.out.println("File is regular : " + fileIsRegular);
		System.out.println("File is readable : " + fileIsReadable);
		System.out.println("Folder is file : " + directoryIsFile);
		System.out.println("Folder is readable : " + directoryIsReadable);
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		//afficherLignes(lines);
		remplirArrayList(arrayVilles, lines);
		afficherArrayList(arrayVilles);
		genererFichier(path, arrayVilles);
	}
	
	public static void afficherLignes(List<String> liste) {
		for(String uneLigne : liste) {
			System.out.println(uneLigne);
		}
	}
	
	public static void afficherArrayList(ArrayList<Ville> tab) {
		for(Ville element : tab) {
			System.out.println(element.toString());
		}
	}
	
	public static void remplirArrayList(ArrayList<Ville> tab, List<String> liste) {
		for(String uneLigne : liste) {
			if(liste.indexOf(uneLigne) > 0) {
				String[] tokens = uneLigne.split(";");
				tab.add(new Ville(tokens[6], tokens[2], tokens[1], Integer.parseInt(tokens[9].replace(" ", ""))));
			}
		}
	}
	
	public static String getEntetes(List<String> liste) {
		String[] entetes = liste.get(0).split(";");
		String entetesUtiles = entetes[6] + ";" + entetes[2] + ";" + entetes[1] + ";" + entetes[9] + ";";
		return entetesUtiles;
	}
	
	public static void genererFichier(Path pathToRead, ArrayList<Ville> tab) throws IOException {
		File file = new File("C:/dev-java/recensement-population-genere.csv");
		Path pathToWrite = Paths.get(file.getAbsolutePath());
		List<String> entetes = Files.readAllLines(pathToRead).subList(0, 1); //La première ligne : entêtes
		List<String> contenuFichier = new ArrayList<String>();
		contenuFichier.add(getEntetes(entetes));
		for(Ville uneVille : tab) {
			if(uneVille.getPopulationTotale() > 25000) {
				contenuFichier.add(uneVille.toString());
			}
		}
		Files.write(pathToWrite, contenuFichier, StandardCharsets.UTF_8);
	}

}
