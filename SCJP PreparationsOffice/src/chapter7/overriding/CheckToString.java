package chapter7.overriding;

public class CheckToString {

	public static void main(String args[]) {
		Integer i = 4;
		System.out.println(i);
		CheckToString checkToString = new CheckToString();
		System.out.println(checkToString);
		System.out.println(checkToString.toString());
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Comment this method to see the output with hashcode.
	 */
	public String toString() {
		return "a";
	}

}
