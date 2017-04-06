package chapter7.generics;

import java.util.ArrayList;
import java.util.List;

public class TestBadLegacy {
	
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(6);
		Inserter in = new Inserter();
		in.insert(list);
	}

}

class Inserter{
	void insert(List list){
		list.add(new String("42"));
	}
}