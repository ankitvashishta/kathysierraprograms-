package chapter6.fileIO;

import java.io.Console;

public class NewConsole {
	
	public static void main(String args[]){
		Console c = System.console();
		char[] pw;
		pw = c.readPassword("%s", "pw: ");
		for(char ch : pw){
			c.format("%c", ch);
		}
		c.format("\n");
		MyUtility myUtility = new MyUtility();
		String name;
		while(true){
			name = c.readLine("%s", "input?: ");
			c.format("output: %s \n", myUtility.doStuff(name));
		}
		
		
	}

}

class MyUtility{
	String doStuff(String arg1){
		return  "result is : " + arg1; 
	}
}
