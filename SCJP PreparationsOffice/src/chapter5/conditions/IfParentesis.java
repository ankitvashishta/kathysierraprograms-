package chapter5.conditions;

public class IfParentesis {

	public static void main(String args[]) {
		int y = 5;
		int x = 2;
		if (((x > 3) && (y < 2)) | doStuff()) {
			System.out.println("Ideal");
		}
		if ((x > 3) && (y < 2) | doStuff()) {
			System.out.println("Changed");
		}
		
		if ((x > 3) & (y < 2) | doStuff()) {
			System.out.println("Single Changed");
		}

	}

	static boolean doStuff() {
		return true;
	}

}
