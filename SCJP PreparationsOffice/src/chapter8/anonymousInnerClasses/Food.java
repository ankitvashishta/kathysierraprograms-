package chapter8.anonymousInnerClasses;

class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}

class Food {
	Popcorn p = new Popcorn() {
		public void sizzle() {
			System.out.println("anonymous sizzling popcorn");
		}

		public void pop() {
			sizzle();
			System.out.println("anonymous popcorn");
		}
	};
	
	Popcorn p1 = new Popcorn(){
		
	};

	public void popIt() {
		p.pop(); // OK, Popcorn has a pop() method
		p1.pop(); // This calls the pop method of super class.
		//p.sizzle(); // Not Legal! Popcorn does not have sizzle()
	}
	
	public static void main(String args[]){
		Food food = new Food();
		food.popIt();
	}
}