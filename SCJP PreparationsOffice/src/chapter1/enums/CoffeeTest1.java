package chapter1.enums;

enum CoffeeSize {BIG, HUGE, OVERWHELMING};    //semi-colon is optional.

class Coffee{
	CoffeeSize size;
}

public class CoffeeTest1 {
	
	public static void main(String args[]){
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.BIG;
		System.out.println(drink.size);
	}

}
