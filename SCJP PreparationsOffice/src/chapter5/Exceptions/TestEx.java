package chapter5.Exceptions;


public class TestEx {
	
	public static void main(String args[]){
		badMethod();
	}
	static void badMethod(){
		doStuff();
	}
	static void doStuff(){
		try{
			throw new Error();
		}catch(Error e){
			throw e;
		}
	}
}
