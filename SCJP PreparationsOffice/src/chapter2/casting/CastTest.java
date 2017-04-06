package chapter2.casting;

class Animal {

	void makeNoise(){
		System.out.println("generic noise");
	}
}

class Dog extends Animal{
	void makeNoise(){
		System.out.println("Dogs Voice");
	}
	
	void playDead(){
		System.out.println("Dead now");
	}
}


public class CastTest{
	public static void main(String args[]){
		String bat = "a";
		System.out.println(bat.toString());
		Animal[] a = {new Animal(), new Dog(), new Dog(), new Animal()};
		for(Animal animal : a){
			animal.makeNoise();
			if(animal instanceof Dog){
				Dog d = (Dog) animal;
				d.playDead();
				((Dog) animal).playDead();
			}
		}
	}
}