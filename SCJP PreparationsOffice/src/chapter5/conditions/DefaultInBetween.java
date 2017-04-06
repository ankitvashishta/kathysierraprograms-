package chapter5.conditions;

public class DefaultInBetween {
	
	public static void main(String args[]) {
		byte x = 5;
		final byte y = 3;
		switch (x) {
		case y:
			System.out.println("hello");
			break;
		default:
			System.out.println("Hi");
			break;
		case 1:
			System.out.println("hello1");
			break;
		
		}
		System.out.println("end");
	}

}
