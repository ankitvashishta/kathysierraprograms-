package chapter7.thingsToDo;

import java.util.ArrayList;
import java.util.List;

public class ReturnLists {

	
	public List<Integer> returnInteger(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		List<Integer> output = new ArrayList<Integer>();
		output = process(list);
		return list;
	}
	
	public static <E extends Number> List<E> process(List<E> nums){
		ArrayList<Integer> list = new ArrayList<Integer>();
		return nums;
	}
}
