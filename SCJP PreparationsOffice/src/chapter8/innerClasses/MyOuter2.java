package chapter8.innerClasses;

/*
 * This is a method-local inner class
 */
class MyOuter2 {
	private String x = "Outer2";

	void doStuff() {
		// method variables should be final if being used in method-local inner class
		final String y = "local variable";
		class MyInner {
			public void seeOuter() {
				System.out.println("Outer x is " + x);
				System.out.println("local variable y is " + y);
			}
		}
		MyInner mi = new MyInner(); // This line must come after the class
		mi.seeOuter();
	}

	public static void main(String args[]) {
		MyOuter2 outer2 = new MyOuter2();
		outer2.doStuff();
	}
}
