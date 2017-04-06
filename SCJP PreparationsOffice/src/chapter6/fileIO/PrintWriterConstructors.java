package chapter6.fileIO;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterConstructors {
	
	public static void main(String args[]){
		File file = new File("testPW.txt");
		try {
			PrintWriter pw = new PrintWriter("testPw.txt");
			pw.println("testPW");
			//pw.println(10L);
			pw.flush();
			pw.close();
			System.out.println("hello");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
