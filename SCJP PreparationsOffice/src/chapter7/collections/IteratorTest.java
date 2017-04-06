package chapter7.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String args[]) {
		List<Dog> d = new ArrayList<Dog>();
		Dog dog = new Dog("aiko");
		d.add(dog);
		d.add(new Dog("Clover"));
		d.add(new Dog("Magnolia"));
		Iterator<Dog> itr = d.iterator();
		while (itr.hasNext()) {
			Dog d2 = itr.next();
			System.out.println(d2.name);
		}
		System.out.println("size : " + d.size());
		System.out.println("get1 : " + d.get(1).name);
		System.out.println("aiko : " + d.indexOf(dog));
		d.remove(2);
		Object[] oa = d.toArray();
		for (Object o : oa) {
			Dog d2 = (Dog) o;
			System.out.println("oa : " + d2.name);
		}

	}
}

class Dog {
	public String name;

	Dog(String n) {
		name = n;
	}
}