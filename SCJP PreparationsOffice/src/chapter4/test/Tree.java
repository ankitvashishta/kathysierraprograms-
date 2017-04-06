package chapter4.test;

interface Vessel {
}

interface Toy {
}

class Boat implements Vessel {
}

class SpeedBoat extends Boat implements Toy {
}

public class Tree {
	public static void main(String args[]) {
		String s = "0";
		Boat b = new Boat();
		Boat b2 = new SpeedBoat();
		SpeedBoat s2 = new SpeedBoat();
		if ((b instanceof Vessel) && (b2 instanceof Toy))
			s += "1";
		if ((s2 instanceof Vessel) && (s2 instanceof Toy))
			s += "2";
		System.out.println(s);	//012
	}
}
