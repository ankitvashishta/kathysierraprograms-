package chapter5.conditions;

public class CharSwitch {

	public static void main(String args[]) {
		char a = 'a';
		switch (a) {

		case 'a':
			System.out.println("a");
			System.out.println("hello");
			break;
		case 'b':
			System.out.println("b");
			break;
		case 'c':
			System.out.println("c");
			break;
		default:
			System.out.println("d");
			break;

		}
		for (int i = 0;; i++) {
			System.out.println(i);
		}
	}

}
