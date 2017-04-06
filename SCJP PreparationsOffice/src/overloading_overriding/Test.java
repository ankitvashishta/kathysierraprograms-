package overloading_overriding;

public class Test {
	
	public static void main(String args[]){
		A a = new B();
		a.a();
			
	}

}

class A{
	public void a(){
		System.out.println("super.a");
	}
	
	public void b(){
		System.out.println("super.b");
	}
}

class B extends A{
	public void a(){
		System.out.println("a");
	}
	
	public void b(){
		System.out.println("b");
	}
}