package zSumps.ocjpPreps;

import java.util.TreeSet;

public class Drink implements Comparable {
	public static int i;
	public String name;

	public int compareTo(Object o) {
		return this.name.compareTo(((Drink) o).name);
	}

	public static void main(String args[]) {
		System.out.println("Hello" + i);
		Drink one = new Drink();
		Drink two = new Drink();
		one.name = "Coffee";
		two.name = "Tea";
		TreeSet set = new TreeSet();
		set.add(one);
		set.add(two);
		for (Object d : set) {
			System.out.println(((Drink) d).name);
		}
		//one.go2(1);
		one.go(3);
		
	}

	public void go(int x) {
		assert (x > 0);
		switch (x) {
		case 2:
			;
		default:
			assert false;
		}
	}

	private void go2(int x) {
		assert (x < 0);
	}
}
