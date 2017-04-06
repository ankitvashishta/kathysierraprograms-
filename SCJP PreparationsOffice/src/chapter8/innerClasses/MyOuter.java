package chapter8.innerClasses;

class MyOuter {
	private int x = 7;

	public void makeInner() {
		MyInner in = new MyInner(); // make an inner instance
		in.seeOuter();
	}

	class MyInner {
		public void seeOuter() {
			System.out.println("Outer x is " + x);
		}
	}
	
	public static void main(String args[]){
		MyOuter outer = new MyOuter();
		outer.makeInner();
	}
}
