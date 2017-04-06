package chapter8.anonymousInnerClasses;

public class MethodArgumentInnerClass {
	public static void main(String args[]) {
		MyWonderfulClass myWonderfulClass = new MyWonderfulClass();
		myWonderfulClass.go();
	}

}

class MyWonderfulClass {
	void go() {
		Bar b = new Bar();
		b.doStuff(new Foo() {
			public void foof() {
				System.out.println("foofy");
			} // end foof method
		}); // end inner class def, arg, and b.doStuff stmt.
	} // end go()
} // end class

interface Foo {
	void foof();
}

class Bar {
	void doStuff(Foo f) {
		//f.foof();
	}
}