package chapter2.inheritance;

public class TestAnimal {

	public static void main(String args[]){
		Horse horse = new Horse();
		horse.test();
	}
}
class Animal{
	public void test(){
		System.out.println("Animal");
	}
	public void eat(){
		System.out.println("Animal Eats");
	}
}
class Horse extends Animal{
	public void test(){
		super.test();
		super.eat();
	}
}