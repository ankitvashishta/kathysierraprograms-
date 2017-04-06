package chapter7.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutoBoxingCollections {

	public static void main(String args[]){
		List testList = new ArrayList();
		testList.add(1);
		/*
		 * prior to java 5, we used:
		 * testList.add(new Integer(1));
		 */
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add("aaa");
		System.out.println(testList);
		
		/*
		 * Sorting a mixed type list
		 * Throws an exception.		java.lang.ClassCastException
		 */
		Collections.sort(testList);
	}
}
