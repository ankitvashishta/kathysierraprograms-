
package chapter6.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDogWriteReadObject {
	
	public static void main(String args[]){
		Collar3 c =new Collar3(3);
		Dog3 d  = new Dog3(c, 5);
		System.out.println("before : " + d.getCollar3().getCollar3Size());
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
			d = (Dog3) is.readObject();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after : " + d.getCollar3().getCollar3Size());
	}
	

}


class Dog3 implements Serializable{
	transient private Collar3 theCollar3;
	private int Dog3Size;

	public Dog3(Collar3 Collar3, int size) {
		theCollar3 = Collar3;
		Dog3Size = size;
	}

	public Collar3 getCollar3() {
		return theCollar3;
	}

	private void writeObject(ObjectOutputStream os){
		try{
			os.defaultWriteObject();
			os.writeInt(theCollar3.getCollar3Size());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private void readObject(ObjectInputStream is){
		try{
			is.defaultReadObject();
			theCollar3 = new Collar3(is.readInt());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Collar3{
	private int Collar3Size;

	public Collar3(int size) {
		Collar3Size = size;
	}

	public int getCollar3Size() {
		return Collar3Size;
	}
}