package chapter6.locales;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Locales2 {
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		cal.set(2011, 11, 14);
		Date d2 = cal.getTime();
		
		Locale locBR = new Locale("pt", "br");
		Locale locDK = new Locale("da", "DK");
		Locale locIT = new Locale("it", "IT");
		Locale locIN = new Locale("hi", "IN");
		
		System.out.println("def " + locBR.getDisplayCountry());
		System.out.println("loc " + locBR.getDisplayCountry(locBR));
		
		System.out.println("def " + locDK.getDisplayLanguage());
		System.out.println("loc " + locDK.getDisplayLanguage(locDK));
		System.out.println("D>I  " + locDK.getDisplayLanguage(locIT));
		
	}

}
