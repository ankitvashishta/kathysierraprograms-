package chapter1.enums;

enum CoffeeSize4 {
	BIG(8), HUGE(10), OVERWHELMING(10) {
		public String getLidCode() {
			return "A";
		}
	};
	CoffeeSize4(int ounces) {
		this.ounces = ounces;
	}

	private int ounces;

	public int getOunces() {
		return ounces;
	}

	public String getLidCode() {
		return "B";
	}
};

public class CoffeeTest4 {
	CoffeeSize4 size;

	public static void main(String args[]) {

		CoffeeTest4 drink1 = new CoffeeTest4();
		drink1.size = CoffeeSize4.BIG;

		CoffeeTest4 drink2 = new CoffeeTest4();
		drink2.size = CoffeeSize4.HUGE;

		CoffeeTest4 drink3 = new CoffeeTest4();
		drink3.size = CoffeeSize4.OVERWHELMING;

		System.out.println(drink1.size.getOunces());

		for (CoffeeSize4 cs : CoffeeSize4.values()) {
			System.out.println(cs + "	     " + cs.getOunces() + "  "
					+ cs.getLidCode());
		}

	}
}
