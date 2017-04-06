package chapter7.hashcode;

public class HashCode_ToString {

	public static void main(String args[]) {

		String a = new String("hello");
		String b = new String("hello");
		System.out.println((a == b) + " " + a.equals(b) + " " + a.hashCode()
				+ " " + b.hashCode());
		TestThem testThem1 = new TestThem(10);
		TestThem testThem2 = new TestThem(10);

		testThem2 = testThem1;
		System.out.println(testThem1.equals(testThem2));
		System.out.println(testThem1.hashCode() + " " + testThem2.hashCode());
		System.out.println((testThem1 == testThem2));
	}

}

class TestThem {
	int theValue;

	TestThem(int theValue) {
		this.theValue = theValue;
	}

	public boolean equals(Object obj) {
		return true;
	}

	public int hashCode() {
		int a = (int) (Math.random() * this.theValue);
		return a;

	}
}
