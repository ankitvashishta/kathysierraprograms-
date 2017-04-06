package chapter5.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadData {
	
	public static void main(String args[]) {
		//8217,, 8220 “, 8221”, 47/, 40(, 41)
		char a = '-';
		int ba = a;
		System.out.println(ba);
		
		try{
			RandomAccessFile raf = new RandomAccessFile("myFile.txt", "r");
			byte[] b = new byte[1000];
			raf.readFully(b, 0, 1000);
		}catch(FileNotFoundException e){
			System.err.println("File not found");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}catch(IOException e){
			System.err.println("IO Error");
			System.err.println(e.toString());
			e.printStackTrace();
		}
	}

}

