package chapter1.miscellaneus;
public class ABstractClass {

	public static void main(String args[]) {
		int [] x = new int[5];
		System.out.println(Hello.x);
		float f = 33333333334.56F;
		short s = (short) f;
		byte b = 1;
		b += 7;
		System.out.println("^^" + b);;
		int a = 0xFF;
		char d = (char) -98;
		System.out.println("**************"+d);
		// ABstractClass abs = new ABstractClass();
	}

}

class Hello {

	public static int x;

	private Hello() {

	}
}
