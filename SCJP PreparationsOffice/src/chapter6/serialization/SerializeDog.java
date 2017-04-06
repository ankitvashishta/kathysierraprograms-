package chapter6.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDog {
	
	public static void main(String args[]){
		Collar2 c =new Collar2(3);
		Dog2 d  = new Dog2(c, 5);
		System.out.println("before : " + d.getCollar2().getCollar2Size());
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
			d = (Dog2) is.readObject();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after : " + d.getCollar2().getCollar2Size());
	}
	

}


class Dog2 implements Serializable{
	private Collar2 theCollar2;
	private int Dog2Size;

	public Dog2(Collar2 Collar2, int size) {
		theCollar2 = Collar2;
		Dog2Size = size;
	}

	public Collar2 getCollar2() {
		return theCollar2;
	}

}

class Collar2 implements Serializable{
	private int Collar2Size;

	public Collar2(int size) {
		Collar2Size = size;
	}

	public int getCollar2Size() {
		return Collar2Size;
	}
}