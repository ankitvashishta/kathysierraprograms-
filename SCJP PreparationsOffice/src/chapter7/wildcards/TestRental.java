package chapter7.wildcards;

import java.util.ArrayList;
import java.util.List;

public class TestRental {
	
	public static void main(String args[]){
		
		Car c1 = new Car();
		Car c2 = new Car();
		List<Car> carList = new ArrayList<Car>();
		carList.add(c1);
		carList.add(c2);
		RentalGeneric<Car> carRental = new RentalGeneric<Car>(2, carList);
		Car carToRent = carRental.getRental();
		System.out.println(carToRent);
		carRental.returnRental(carToRent);
		System.out.println(carRental.getRental());
		/*
		 * The following line would give a compilation error.
		 * Since a Cat1 cannot be added to a list of Car.
		 */
		//carList.add(new Cat1("Fluffy"));
	}

}

class Cat1 extends Animal{
	
	String catName;
	
	Cat1(String catName){
		this.catName = catName;
	}

	@Override
	public void checkup() {
		// TODO Auto-generated method stub
		
	}
}