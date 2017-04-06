package chapter8.Tests;

import chapter8.Tests.Cathedral.Sanctum;

public class Tour {
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
