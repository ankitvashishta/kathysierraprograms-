package chapter8.anonymousInnerClasses;

import chapter8.anonymousInnerClasses.Cathedral.Sanctum;

public class Test {
	public static void main(String[] args) {
		Cathedral c = new Cathedral();
		Sanctum s = c.new Sanctum();
		s.go();
	}
}

class Cathedral {
	class Sanctum {
		void go() {
			System.out.println("spooky");
		}
	}
}