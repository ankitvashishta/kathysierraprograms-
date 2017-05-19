package object.clone;

class Animal {

	private String animalType;

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

}

class Dog extends Animal {

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

class BullDog extends Dog implements Cloneable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return (BullDog) super.clone();
	}

	public String toString() {
		return this.getAnimalType() + " " + this.getAddress() + " " + this.getName();
	}

}

public class TestCloneable {

	public static void main(String args[]) throws CloneNotSupportedException{
		BullDog bull = new BullDog();
		bull.setAnimalType("Dangerous");
		bull.setAddress("Galleria Market");
		bull.setName("Akicho");
		
		BullDog friendlyBull = (BullDog) bull.clone();
		friendlyBull.setAnimalType("Has Become Friendly");
		
		System.out.println(bull);
		System.out.println(friendlyBull);
	}

}
