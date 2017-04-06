package overloading_overriding;

public class TestAnimal {
	public static void main(String args[]){
		UseAnimals useAnimal = new UseAnimals();
		Animal animal = new Animal();
		Animal horse = new Horse();
		animal.eat();
		horse.eat();
		useAnimal.callAnimal(animal);
		useAnimal.callAnimal(horse);
	}

}

class Animal{
	public void eat(){
		System.out.println("Generic");
	}
}

class Horse extends Animal{
	public void eat(){
		System.out.println("Horse");
	}
}

class UseAnimals{
	public void callAnimal(Animal an){
		System.out.println("Animalssssssssss");
	}
	
	public void callAnimal(Horse ho){
		System.out.println("Horseeeeeeeee");
	}
}