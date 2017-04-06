package chapter6.stringHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Writer1 {
	public static void main(String args[]){
		char[] in = new char[50];
		int size = 0;
		try{
			File file = new File("D:\\My stuff\\PrintWriter.txt");
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.println("Hello");
			printWriter.println("Writer");
			printWriter.println("PrintWriter");
			printWriter.flush();
			printWriter.close();
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String data;
			while((data = bufferedReader.readLine()) != null){
				System.out.println(data);
			}
			bufferedReader.close();
			fileReader.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
