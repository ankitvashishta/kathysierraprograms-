package chapter7.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {

	public static void main(String args[]) {
		int[] a = { 5, 3, 4, 8, 0 };
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 5));
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		for (int x : a) {
			System.out.println(x);
		}
		System.out.println("****************************");
		ArraysSort a1 = new ArraysSort();
		ArraysSort a2 = new ArraysSort();
		ArraysSort a3 = new ArraysSort();
		ArraysSort a4 = new ArraysSort();
		ArraysSort[] as = {a1, a2, a3, a4};
		System.out.println(Arrays.toString(as));
	}
	
	@Override
	public String toString(){
		return "hello";
		
	}
}
