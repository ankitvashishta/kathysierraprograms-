package chapter7.wildcards;

import java.util.ArrayList;
import java.util.List;

public class TestWildCards {

	public static void main(String args[]) {
		List<Integer> myList = new ArrayList<Integer>();
		Bar bar = new Bar();
		bar.doInsert(myList);
		
		Bar1 bar1 = new Bar1();
		/*
		 * We are trying to pass a List<Integer> to a List<Object>, which would give a compile time error.
		 */
		//bar1.doInsert(myList);
	}

}

class Bar {

	void doInsert(List<?> list) {
		/*
		 * The add() method is not allowed on any list that we pass to a Wildcard argument.
		 * Hence the below method gives a compile time error.
		 */
		//list.add(new Dog());
	}
}

class Bar1 {

	void doInsert(List<Object> list) {
		
		list.add(new Dog());
	}
}

abstract class Animal {
	public abstract void checkup();
}

class Dog extends Animal {
	@Override
	public void checkup() {
		System.out.println("Dog Checkup");
	}
}

class Cat extends Animal {
	@Override
	public void checkup() {
		System.out.println("Cat Checkup");
	}
}

class Bird extends Animal {
	@Override
	public void checkup() {
		System.out.println("Bird Checkup");
	}
}