package chapter4.test;

public class Hexy {

	public static void main(String args[]) {
		Integer i = 42;
		String s = (i < 40) ? "life" : (i > 50) ? "universe" : "anything";
		System.out.println(s);		//anything
	}

}
