package chapter7.wildcards;

import java.util.List;

public class CarRental extends Rental {

	public CarRental(int maxNum, List<Car> rentalPool) {
		super(maxNum, rentalPool);
	}

	public Car getRental() {
		return (Car) super.getRental();
	}

	public void returnRental(Object o) {
		if (o instanceof Car) {
			super.returnRental(o);
		} else {
			System.out.println("cannot add a non-car");
		}
	}
}

class Car {

}
