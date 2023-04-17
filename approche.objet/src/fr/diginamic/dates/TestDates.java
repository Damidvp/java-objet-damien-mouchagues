package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date dateDuJour = new Date();
		SimpleDateFormat sdfDateDuJour = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(sdfDateDuJour.format(dateDuJour));
		
		Date autreDate = new Date(116, 5, 19, 23, 59, 30); //Deprecated
		SimpleDateFormat sdfAutreDate = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.println(sdfAutreDate.format(autreDate));
		
		Date dateSysteme = new Date(System.currentTimeMillis());
		System.out.println("Date système : " + sdfAutreDate.format(dateSysteme));
	}

}
