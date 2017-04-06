package chapter1.miscellaneus;
public class CoffeeTest extends Demo {

	public static void main(String args[]) {
		Demo demo = new Demo();
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.HUGE;
		System.out.println("Hi this is enum : " + drink.size);
		int yy = demo.count(10, 13);
		//System.out.println(int x = count(10, 13));
	}
	
	void demo(){
		System.out.println(count(10, 13));
	}
}

class Coffee {

	CoffeeSize size;
}

class Demo{
	int count(int x, int y){
		return x+y;
	}
}