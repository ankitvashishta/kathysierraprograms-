package chapter5.conditions;

public class TestSwitch {
	public static void main(String args[]) {
		byte x = 5;
		final byte y = 3;
		switch (x) {
		case y:
			System.out.println("hello");
			break;
		case 1:
			System.out.println("hello1");
			break;
		default:
			System.out.println("Hi");
			break;
		}
		System.out.println("end");
	}

}
