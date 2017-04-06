package chapter7.generics;

import java.util.ArrayList;
import java.util.List;

public class AnimalDoctorGeneric {
	
	public void checkAnimals(ArrayList<Animal> animals) {
		for (Animal a : animals) {
			a.checkup();
		}
	}

	public static void main(String args[]) {
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Cat());
		
		List<Bird> birds = new ArrayList<Bird>();
		birds.add(new Bird());
		
		AnimalDoctor doc = new AnimalDoctor();
		/*
		 * Following lines will give an error.
		 * Since it is a mismatch from Animal to its subtypes
		 */
//		doc.checkAnimals(dogs);
//		doc.checkAnimals(cats);
//		doc.checkAnimals(birds);
	}

}
