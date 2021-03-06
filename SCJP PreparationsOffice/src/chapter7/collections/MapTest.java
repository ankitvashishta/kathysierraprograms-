package chapter7.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String args[]) {
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new Dog1("aiko"));
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT,"CAT Key");
		Dog1 d1 = new Dog1("clover");
		m.put(d1,"Dog key");
		m.put(new Cat(), "Cat key");
		System.out.println(m.get("k1"));
		String k2="k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println(m.size());
		d1.name = "magnolia";
		System.out.println(m.get(d1));
		System.out.println(m.get(new Dog1("clover")));
		
	}

}

class Dog1 {
	public Dog1(String n) {
		name = n;
	}

	String name;

	public boolean equals(Object o) {
		if ((o instanceof Dog1) && (((Dog1) o).name == name)) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return name.length();
	}
}

class Cat {
}

enum Pets {
	DOG, CAT, HORSE
}
