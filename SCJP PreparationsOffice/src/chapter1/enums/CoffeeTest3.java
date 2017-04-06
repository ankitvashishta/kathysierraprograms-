package chapter1.enums;

enum CoffeeSize3{
	BIG(8), HUGE(10), OVERWHELMING(10);
	CoffeeSize3(int ounces){
		this.ounces = ounces;
	}
	private int ounces;
	public int getOunces(){
		return ounces;
	}
};


public class CoffeeTest3 {
	CoffeeSize3 size;
	public static void main(String args[]){
		
		CoffeeTest3 drink1 =  new CoffeeTest3();
		drink1.size = CoffeeSize3.BIG;
		
		CoffeeTest3 drink2 =  new CoffeeTest3();
		drink2.size = CoffeeSize3.HUGE;
		
		CoffeeTest3 drink3 =  new CoffeeTest3();
		drink3.size = CoffeeSize3.OVERWHELMING;
		
		System.out.println(drink1.size.getOunces());
		
		for(CoffeeSize3 cs : CoffeeSize3.values()){
			System.out.println(cs + "	     " +cs.getOunces());
		}
		
	}
}
