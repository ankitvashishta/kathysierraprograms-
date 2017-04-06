package chapter7.hashcode;

public class HasHash {

	public int x;

	HasHash(int xVal) {
		x = xVal;
	}

	public boolean equals(Object o) {
		if (o instanceof HasHash) {
			HasHash h = (HasHash) o;
			if (h.x == this.x) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public int hashCode() {
		return x * 17;
	}

	public static void main(String args[]) {
		HasHash hash1 = new HasHash(1);
		HasHash hash2 = new HasHash(1);
		System.out.println(hash1.equals(hash2));
	}

}
