package chapter6.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sample1 {

	public static void main(String args[]) {
		Dog d = new Dog(35, "Fido");
		System.out.println("before : " + d.weight + d.name);
		try {
			FileOutputStream fs = new FileOutputStream("testser.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fs = new FileInputStream("testser.ser");
			ObjectInputStream is = new ObjectInputStream(fs);
			d = (Dog) is.readObject();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after : " + d.weight + d.name);
	}
}

class Dog extends Animal implements Serializable {
	String name;

	Dog(int w, String n) {
		weight = w;
		name = n;
	}
}

class Animal {
	int weight = 42;
}
