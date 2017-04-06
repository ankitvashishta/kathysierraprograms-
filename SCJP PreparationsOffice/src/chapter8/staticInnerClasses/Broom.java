package chapter8.staticInnerClasses;

class BigOuter {
	static class Nest {
		void go() {
			System.out.println("hi");
		}
	}
}

class Broom {
	static class B2 {
		void goB2() {
			System.out.println("hi 2");
		}
	}
	
	class NonStatic{
		void printStatement(){
			System.out.println("Inside non-static");
		}
	}

	public static void main(String[] args) {
		BigOuter.Nest n = new BigOuter.Nest(); // both class names
		n.go();
		B2 b2 = new B2(); // access the enclosed class
		b2.goB2();
		new Broom().go();
		
		NonStatic non = new Broom().new NonStatic();
		non.printStatement();
	}
	
	public void go(){
		B2 b2 = new B2();
		b2.goB2();
	}
}