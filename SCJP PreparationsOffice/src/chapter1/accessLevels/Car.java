package chapter1.accessLevels;

import chapter1.miscellaneus.*;

public class Car extends Vehicle{
	
	public void checkX(){
		System.out.println(x);
	}

}

class BMW extends Car{
	static int x = 1;
	public void seeX(){
		System.out.println(x);
	}

	//car = new Vehicle();
	//int y = car.x;
}
