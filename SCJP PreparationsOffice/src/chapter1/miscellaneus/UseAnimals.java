package chapter1.miscellaneus;
class Animal{
	
}

class Horse extends Animal{
	
}

public class UseAnimals {
	
	public void doStuff(Animal a){
		System.out.println("Animal");
	}
	
	public void doStuff(Horse h){
		System.out.println("Horse");
	}
	
	public static void main(String args[]){
		
		Animal an = new Animal();
		Horse ho = new Horse();
		UseAnimals ua = new UseAnimals();
		ua.doStuff(an);
		ua.doStuff(ho);
		
	}

}
