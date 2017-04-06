package chapter7.wildcards;

import java.util.List;

public class AnimalHolder<T extends Animal> { // use "T" instead
	// of "?"
	T animal;
	List<T> animalList;

	public static void main(String[] args) {
		AnimalHolder<Dog> dogHolder = new AnimalHolder<Dog>(); // OK
		// AnimalHolder<Integer> x = new AnimalHolder<Integer>(); // NO!
	}

	public void addT(T t) {
		animalList.add(t);
	}
}


