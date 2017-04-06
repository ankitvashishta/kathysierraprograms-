package chapter1.enums;

class Coffee2{
	enum CoffeeSize2{BIG, HUGE, OVERWHELMING};   //semi-colon is optional.
	
	CoffeeSize2 size;
}

public class CoffeeTest2 {

	public static void main(String args[]){
		Coffee2 drink = new Coffee2();
		drink.size = Coffee2.CoffeeSize2.BIG;
		System.out.println(drink.size);
	}
}
