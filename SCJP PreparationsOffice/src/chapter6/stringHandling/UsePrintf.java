package chapter6.stringHandling;

public class UsePrintf {
	public static void main(String args[]) {
		String s1 = "abc";
		String s2 = "abc";
		if (s1 == s2)
			System.out.println("*********************");
		System.out.printf("%2$d + %1$d", 12, 32);
	}

}
