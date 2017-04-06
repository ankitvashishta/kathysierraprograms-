package chapter6.serialization;

public class Dog1 {
	private Collar theCollar;
	private int dogSize;

	public Dog1(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}

	public Collar getCollar() {
		return theCollar;
	}

}

class Collar {
	private int collarSize;

	public Collar(int size) {
		collarSize = size;
	}

	public int getCollarSize() {
		return collarSize;
	}
}