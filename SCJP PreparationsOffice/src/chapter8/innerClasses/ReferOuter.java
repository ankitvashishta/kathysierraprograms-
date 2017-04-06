package chapter8.innerClasses;

class MyOuter1 {
	private int x = 7;

	public void makeInner() {
		MyInner1 in = new MyInner1();
		in.seeOuter();
	}

	class MyInner1 {
		public void seeOuter() {
			System.out.println("Outer x is " + x);
			System.out.println("Inner class ref is " + this);
			System.out.println("Outer class ref is " + MyOuter1.this);
		}
	}

}

public class ReferOuter {
	public static void main(String[] args) {
		MyOuter1.MyInner1 inner = new MyOuter1().new MyInner1();
		inner.seeOuter();
	}
}