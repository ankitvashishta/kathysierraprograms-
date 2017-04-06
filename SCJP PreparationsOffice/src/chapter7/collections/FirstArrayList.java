package chapter7.collections;

import java.util.ArrayList;
import java.util.List;

public class FirstArrayList {
	
	public static void main(String args[]){
		List<String> testList = new ArrayList<String>();
		String s = "hi";
		testList.add("String");
		testList.add(s);
		testList.add(s+s);
		System.out.println(testList.size());
		System.out.println(testList.contains(42));
		System.out.println(testList.contains("hihi"));
		testList.remove("hi");
		System.out.println(testList.size());
		System.out.println(testList);
	}

}
