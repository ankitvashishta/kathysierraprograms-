package chapter6.stringHandling;

public class SplitTest {
	
	public static void main(String args[]){
		
		String[] tokens = "ab5 ccc 45 @".split("\\d");
		System.out.println("Length : " + tokens.length);
		for(String s: tokens){
			System.out.println(">" + s +"<");
		}
	}

}
