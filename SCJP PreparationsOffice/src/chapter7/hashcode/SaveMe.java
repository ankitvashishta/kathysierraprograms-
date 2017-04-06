package chapter7.hashcode;

import java.io.Serializable;

public class SaveMe implements Serializable {

	transient int x;
	int y;

	SaveMe(int xVal, int yVal) {
		x = xVal;
		y = yVal;
	}

	public int hashCode() {
		return x ^ y;
	}

	public boolean equals(Object o) {
		SaveMe test = (SaveMe) o;
		if (test.x == x && test.y == y) {
			return true;
		}else{
			return false;
		}
	}

}
