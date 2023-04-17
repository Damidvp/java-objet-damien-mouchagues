package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar calendarDeMai = new GregorianCalendar(2016, 4, 19, 23, 59, 30);
		Date dateEnMai = calendarDeMai.getTime();
		SimpleDateFormat sdfDateDeMai = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(sdfDateDeMai.format(dateEnMai));
		
		Calendar calendarDuJour = new GregorianCalendar();
		Date dateDuJour = calendarDuJour.getTime();
		SimpleDateFormat sdfDateDuJour = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.println(sdfDateDuJour.format(dateDuJour));
		
		DateFormat languageFormatFr = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
		DateFormat languageFormatRu = DateFormat.getDateInstance(DateFormat.FULL, new Locale("ru", "RU"));
		DateFormat languageFormatCh = DateFormat.getDateInstance(DateFormat.FULL, Locale.SIMPLIFIED_CHINESE);
		DateFormat languageFormatDe = DateFormat.getDateInstance(DateFormat.FULL, new Locale("de", "DE"));
		System.out.println(languageFormatFr.format(dateDuJour));
		System.out.println(languageFormatCh.format(dateDuJour));
		System.out.println(languageFormatRu.format(dateDuJour));
		System.out.println(languageFormatDe.format(dateDuJour));
	}

}
