package zSumps.ocjpPreps;

import java.util.Collection;
import java.util.LinkedList;

public class TestCollection {
	public static Collection get() {
		Collection sorted = new LinkedList();
		sorted.add("B");
		sorted.add("C");
		sorted.add("A");
		return sorted;
	}
	public Collection set() {
		Collection sorted = new LinkedList();
		sorted.add("B");
		sorted.add("C");
		sorted.add("A");
		return sorted;
	}

	public static void main(String[] args) {
		A a = new A();
		a.hello();
		for (Object obj : get()) {
			System.out.print(obj + ", ");
		}
	}
}

class A {
	public TestCollection testCollection;

	void hello() {
		testCollection.set();
	}
}
