package chapter5.Exceptions;

import java.io.EOFException;

public class Test {
	
	public int myMethod1() throws EOFException{
		return myMethod2();
	}

	public int myMethod2()throws EOFException{
		return 1;
	}
	
	public int myMethod4() {
		return myMethod3();
	}
	public int myMethod3(){
		throw new NullPointerException();
	}
}
