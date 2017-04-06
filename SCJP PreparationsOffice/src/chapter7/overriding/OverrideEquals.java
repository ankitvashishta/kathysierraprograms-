package chapter7.overriding;

public class OverrideEquals {
	public static void main(String args[]){
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		if(one.equals(two)){
			System.out.println("One and two are equal");
		}
	}

}

class Moof {
	private int moofValue;

	Moof(int val) {
		moofValue = val;
	}

	public int getMoofValue() {
		return moofValue;
	}

	public boolean equals(Object o) {
		if ((o instanceof Moof)
				&& (((Moof) o).getMoofValue() == this.getMoofValue())) {
			return true;
		} else {
			return false;
		}
	}
}
