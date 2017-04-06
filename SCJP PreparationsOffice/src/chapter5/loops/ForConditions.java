package chapter5.loops;

public class ForConditions {
	public static void main(String args[]) {
		for (int x = 0; x < 5; System.out.println("Inside Loop structure")) {
			System.out.println(x);
			x++;
		}
		System.out.println();
		/*
		 * using continue
		 */
		for (int x = 0; x < 5; x++) {
			System.out.println(x);
			continue;
		}
	}

}
