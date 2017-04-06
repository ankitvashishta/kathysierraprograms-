package chapter8.anonymousInnerClasses;

interface Cookable {
	public void cook();
}

class Food1 {
	Cookable c = new Cookable() {
		public void cook() {
			System.out.println("anonymous cookable implementer");
		}
	};
	
	public void cookIt(){
		c.cook();
	}
	
	public static void main(String args[]){
		Food1 food = new Food1();
		food.cookIt();
	}
}
