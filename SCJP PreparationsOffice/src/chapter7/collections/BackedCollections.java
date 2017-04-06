package chapter7.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class BackedCollections {

	public static void main(String args[]){

		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("a", "ant");
		map.put("d", "dog");
		map.put("h", "horse");

		SortedMap<String, String> subMap;
		subMap = map.subMap("b", "g");
		
		System.out.println(map + " " + subMap);

		map.put("b", "bat");
		subMap.put("f", "fish");

		map.put("r", "raccoon");

		/*
		 * We commented the below lines bcoz at runtime, it will throw an error : key out of range
		 */
		//subMap.put("g", "goat");
		//subMap.put("p", "pig");

		System.out.println(map + " " + subMap);

		map.pollFirstEntry();
		
		//map.pollFirstEntry();
		//map.pollFirstEntry();

		System.out.println(map + " " + subMap);
	}

}
