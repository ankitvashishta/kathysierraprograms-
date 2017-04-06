package chapter7.collections;

import java.util.*;

public class Ferry {
	
	public static void main(String args[]){
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205);
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		
		//Java 5 Version.
		
		TreeSet<Integer> subset = new TreeSet<Integer>();
		subset = (TreeSet<Integer>) times.headSet(1600);
		System.out.println("J5 - last before 4 pm is : " + subset.last());
		
		TreeSet<Integer> subset2 = new TreeSet<Integer>();
		subset2 = (TreeSet<Integer>) times.tailSet(2000);
		System.out.println("J5 - first after 8 pm is : " + subset2.first());
		
		//Java 6 Version.
		
		System.out.println("J6 - last before 4 pm is : " + times.lower(1600));
		System.out.println("J6 - first after 8 pm is : " + subset2.higher(2000));
	}

}
