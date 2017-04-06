package chapter6.locales;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleExample {
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		cal.set(2011, 11, 14);
		Date date2 = cal.getTime();
		
		Locale locIT = new Locale("it", "IT");
		Locale locPT = new Locale("pt");
		Locale locBR = new Locale("pt", "BR");
		Locale locIN = new Locale("hi", "IN");
		Locale locJA = new Locale("ja");
		
		DateFormat dfUS = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println("US : " + dfUS.format(date2) );
		
		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		System.out.println("Italy : " + dfIT.format(date2));
		
		DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
		System.out.println("Portugal : " + dfPT.format(date2));
		
		DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
		System.out.println("Brazil : " + dfBR.format(date2));
		
		DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
		System.out.println("India : " + dfIN.format(date2));
		
		DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
		System.out.println("Japan : " + dfJA.format(date2));
		
	}

}
