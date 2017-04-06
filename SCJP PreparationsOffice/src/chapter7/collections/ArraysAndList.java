package chapter7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndList {

	public static void main(String args[]) {
		// Array to List
		String[] sa = { "one", "two", "three", "four" };
		List sList = Arrays.asList(sa);
		System.out.println("size " + sList.size());
		System.out.println("idx2 " + sList.get(2));

		sList.set(3, "six");
		sa[1] = "five";
		for (String s : sa) {
			System.out.print(s + " ");
		}
		System.out.println("\nsl[1] " + sList.get(1));
		System.out.println("sa[3] " + sa[3]);

		// List to Array.

		List<Integer> iL = new ArrayList<Integer>();
		for (int x = 0; x < 3; x++) {
			iL.add(x);
		}
		Object[] oa = iL.toArray();
		Integer[] ia2 = new Integer[3];
		ia2 = iL.toArray(ia2);
		for (Integer a : ia2)
			System.out.println(a);
		for (int a : ia2)
			System.out.println(a);

	}
}
