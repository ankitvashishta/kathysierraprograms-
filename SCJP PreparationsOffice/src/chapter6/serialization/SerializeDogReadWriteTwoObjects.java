
package chapter6.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDogReadWriteTwoObjects {
	
	public static void main(String args[]){
		Collar4 c =new Collar4(3, 5);
		Dog4 d  = new Dog4(c, 5);
		System.out.println("before : " + d.getCollar4().getCollar4Size() + " " + d.getCollar4().getCollar4Weight());
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
			d = (Dog4) is.readObject();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after : " + d.getCollar4().getCollar4Size() + " " + d.getCollar4().getCollar4Weight());
	}
	

}


class Dog4 implements Serializable{
	transient private Collar4 theCollar4;
	private int Dog4Size;

	public Dog4(Collar4 Collar4, int size) {
		theCollar4 = Collar4;
		Dog4Size = size;
	}

	public Collar4 getCollar4() {
		return theCollar4;
	}

	private void writeObject(ObjectOutputStream os){
		try{
			os.defaultWriteObject();
			os.writeInt(theCollar4.getCollar4Size());
			os.writeInt(theCollar4.getCollar4Weight());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private void readObject(ObjectInputStream is){
		try{
			is.defaultReadObject();
			theCollar4 = new Collar4(is.readInt(), is.readInt());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Collar4{
	private int Collar4Size;
	private int Collar4Weight;

	public Collar4(int size, int weight) {
		Collar4Size = size;
		Collar4Weight = weight;
	}

	public int getCollar4Size() {
		return Collar4Size;
	}

	public int getCollar4Weight() {
		return Collar4Weight;
	}
	
	
}