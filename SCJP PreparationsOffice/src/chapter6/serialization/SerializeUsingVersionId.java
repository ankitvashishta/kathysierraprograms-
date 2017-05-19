package chapter6.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * 
 * @author Vashishta.Ankit
 *
 */
public class SerializeUsingVersionId {
	
	/**
	 * To see how the serialVersionUID works, and is important.
	 * 
	 * Use the class Vehicle, and apply the following cases.
	 * 
	 * Case 1: When we use the version id for serialization.
	 * 	 (A) : Add another field to the object and de-serialize.
	 * Result - De Serialization works fine.
	 * 	 (B) : Delete a field from the object and de-serialize.
	 * Result - De Serialization works fine.
	 * 
	 * Case 2: When we don't use the version id for serialization.
	 * 	 (A) : Add another field to the object and de-serialize.
	 * Result - De Serialization fails and throws InvalidClassException.
	 * 	 (B) : Delete a field from the object and de-serialize.
	 * Result - De Serialization fails and throws InvalidClassException.
	 * 
	 * Case 3: When we use the version id for serialization and remove it
	 * 			for de-serialization, without changing the object class.
	 * Result - De Serialization fails and throws InvalidClassException.
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		/*
		 * Serialize it, and to verify the effects, change the Vehicle class before de-serialization.
		 */
		serializeObject();
		deserializeObject();
	}

	private static void serializeObject() {
		Vehicle vehicle = new Vehicle("Car", "White");
		try {
			FileOutputStream fs = new FileOutputStream("testser.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(vehicle);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void deserializeObject() {
		try {
			FileInputStream fs = new FileInputStream("testser.ser");
			ObjectInputStream is = new ObjectInputStream(fs);
			Vehicle vehicle = (Vehicle) is.readObject();
			is.close();
			System.out.println(vehicle.getVehicleType());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
