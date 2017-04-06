package chapter7.generics;

abstract class Animal {
	public abstract void checkup();
}

class Dog extends Animal {
	@Override
	public void checkup() {
		System.out.println("Dog Checkup");
	}
}

class Cat extends Animal {
	@Override
	public void checkup() {
		System.out.println("Cat Checkup");
	}
}

class Bird extends Animal {
	@Override
	public void checkup() {
		System.out.println("Bird Checkup");
	}
}

public class AnimalDoctor {

	public void checkAnimals(Animal[] animals) {
		for (Animal a : animals) {
			a.checkup();
		}
	}

	public static void main(String args[]) {
		Dog[] dogs = { new Dog(), new Dog() };
		Cat[] cats = { new Cat(), new Cat(), new Cat() };
		Bird[] birds = { new Bird() };
		
		AnimalDoctor doc = new AnimalDoctor();
		doc.checkAnimals(dogs);
		doc.checkAnimals(cats);
		doc.checkAnimals(birds);
	}

}
