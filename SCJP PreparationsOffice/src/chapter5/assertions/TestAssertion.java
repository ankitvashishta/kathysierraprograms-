package chapter5.assertions;

public class TestAssertion {
	
	public static void main(String args[]){
		methodA(2);
	}
	static void methodA(int num){
		assert(num>3) : new TestSimpleAssert();
		System.out.println(num);
	}

}
class TestSimpleAssert{
	
}