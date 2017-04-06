package chapter6.stringHandling;

public class StringtoString {

	public static void main(String args[]) {
		String a = "Ankit" + "---";
		StringBuffer sb = new StringBuffer();
		sb.append("a");
		StringBuffer ab = new StringBuffer();
		sb = ab;
		sb = new StringBuffer();
		System.out.println(a.toString());
	}
}
