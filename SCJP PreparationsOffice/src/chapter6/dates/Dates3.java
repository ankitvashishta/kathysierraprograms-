package chapter6.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Dates3 {

	public static void main(String args[]){
		Date d1 = new Date(1000000000000L);
		System.out.println("1st date : " + d1.toString());
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		String s = dateFormat.format(d1);
		System.out.println(s);
		
		try{
			Date date2 = dateFormat.parse(s);
			System.out.println("Parsed : "+date2);
		}catch (ParseException e) {
			System.out.println("exception");
		}
	}
}
