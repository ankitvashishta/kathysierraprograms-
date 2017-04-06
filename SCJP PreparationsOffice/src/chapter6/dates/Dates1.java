package chapter6.dates;

import java.util.Calendar;
import java.util.Date;

public class Dates1 {

	public static void main(String args[]){
		Date d1 = new Date(1000000000000L);
		System.out.println("1st date : " + d1.toString());
		Date d22 = new Date();
		System.out.println("Current : " + d22);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d1);
		if(Calendar.SUNDAY == cal.getFirstDayOfWeek()){
			System.out.println("Sunday is the first day of week");
		}
		System.out.println("trillionth mill day of week is : " + cal.get(Calendar.DAY_OF_WEEK));
		cal.add(Calendar.MONTH, 1);
		Date d2 = cal.getTime();
		System.out.println("new date : " + d2.toString());
	}
}
