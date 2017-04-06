package chapter6.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDog1 {
	
	public static void main(String args[]){
		Collar5 c =new Collar5(3);
		Dog5 d  = new Dog5(c, 5);
		System.out.println("before : " + d.getCollar5().getCollar5Size());
		try {
			FileOutputStream fs = new FileOutputStream("testser.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fs = new FileInputStream("testser.txt");
			ObjectInputStream is = new ObjectInputStream(fs);
			d = (Dog5) is.readObject();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after : " + d.getCollar5().getCollar5Size());
	}
	

}


class Dog5 implements Serializable{
	private transient Collar5 theCollar5;
	private int Dog5Size;

	public Dog5(Collar5 Collar5, int size) {
		theCollar5 = Collar5;
		Dog5Size = size;
	}

	public Collar5 getCollar5() {
		return theCollar5;
	}

}

class Collar5 {
	private int Collar5Size;

	public Collar5(int size) {
		Collar5Size = size;
	}

	public int getCollar5Size() {
		return Collar5Size;
	}
}