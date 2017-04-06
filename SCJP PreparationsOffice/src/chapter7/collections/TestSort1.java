package chapter7.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {

	public static void main(String args[]){
		ArrayList<String> stuff = new ArrayList<String>();
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspin");
		stuff.add("Telluride");
		System.out.println("Unsorted : " + stuff);
		Collections.sort(stuff);
		System.out.println("Sorted : " + stuff);
	}
}
