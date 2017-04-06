package chapter6.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StramsConstructors {

	public static void main(String args[]){
		try{
			FileOutputStream fs = new FileOutputStream("test.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject("Ankit");
			os.flush();
			os.close();
			
			
			
			FileInputStream fis = new FileInputStream("test.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			String a = (String)is.readObject();
			System.out.println(a);
		}catch(Exception e){
			
		}
		
	}
}
