package chapter6.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat implements Serializable {
	int i = 42;
}

public class SerializeCat {
	public static void main(String args[]) {
		Cat c = new Cat();
		System.out.println("before : " + c.i);
		c.i = 2;
		try {
			FileOutputStream fs = new FileOutputStream("testser.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fs = new FileInputStream("testser.ser");
			ObjectInputStream is = new ObjectInputStream(fs);
			c = (Cat) is.readObject();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after : " + c.i);
	}

}
