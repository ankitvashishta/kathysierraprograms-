package chapter7.wildcards;

import java.util.List;

public class Rental {

	private List rentalPool;
	private int maxNum;

	public Rental(int maxNum, List rentalPool) {
		this.maxNum = maxNum;
		this.rentalPool = rentalPool;
	}
	
	public Object getRental(){
		return rentalPool.get(0);
	}
	
	public void returnRental(Object o){
		rentalPool.add(o);
	}

}
