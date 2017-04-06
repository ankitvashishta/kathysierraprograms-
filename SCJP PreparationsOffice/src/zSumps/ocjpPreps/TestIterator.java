package zSumps.ocjpPreps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class TestIterator {

	public static Iterator reverse(List list) {
		Collections.reverse(list);
		return list.iterator();
	}

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("123456789");
		s.delete(0,3).delete(1,3).delete(2,5).insert(1, "24");
		System.out.println(s);
		
		Locale loc = Locale.getDefault();
//		System.out.println(loc.getDisplayCountry()
//		+ " " + df.format(d));
		
		
//		List list = new ArrayList();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		for (Object obj : reverse(list))
//			System.out.print(obj + ", ");
	}
}
