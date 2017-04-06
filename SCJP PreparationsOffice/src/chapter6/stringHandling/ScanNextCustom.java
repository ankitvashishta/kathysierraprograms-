package chapter6.stringHandling;

import java.util.Scanner;

public class ScanNextCustom {
	
	public static void main(String args[]){
		boolean b2,b;
		int i;
		String hits = " ";
		Scanner s2 = new Scanner(args[0]);
		while(b = s2.hasNext()){
			if(s2.hasNextInt()){
				i = s2.nextInt();
				hits += "i";
			}else if(s2.hasNextBoolean()){
				b2 = s2.nextBoolean();
				hits += "b";
			}else{
				s2.next();
				hits +="s2";
			}
		}
		System.out.println("hits : " + hits);
		Object arra[] = {1,2};
		main(arra);
	}
	
	public static void main(Object args[]){
		System.out.println("hello");
	}

}
