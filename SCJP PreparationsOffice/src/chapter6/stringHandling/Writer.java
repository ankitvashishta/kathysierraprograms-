package chapter6.stringHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Writer {
	public static void main(String args[]){
		char[] in = new char[50];
		int size = 0;
		try{
			File file = new File("D:\\My stuff\\FileWriter.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Hello\n\nWorld");
			fileWriter.flush();
			fileWriter.close();
			
			FileReader fileReader = new FileReader(file);
			size = fileReader.read(in);
			System.out.println(size + "");
			for(char c : in){
				System.out.print(c);
			}
			fileReader.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
