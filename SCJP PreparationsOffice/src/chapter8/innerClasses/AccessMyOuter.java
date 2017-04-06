package chapter8.innerClasses;

import chapter8.innerClasses.MyOuter.MyInner;

public class AccessMyOuter {
	
	public static void main(String args[]){
		
		//Way One:
		MyOuter outer = new MyOuter();
		MyInner inner = outer.new MyInner();
		inner.seeOuter();
		
		//Way Two:
		MyInner inner1 = new MyOuter().new MyInner();
		inner1.seeOuter();
		
		//Way Three:
		MyOuter.MyInner inner2 = new MyOuter().new MyInner();
		inner2.seeOuter();
		
		//Way Four:
		MyOuter outer1 = new MyOuter();
		MyOuter.MyInner inner3 = outer1.new MyInner();
		inner3.seeOuter();
		
		//Way Five:
		MyOuter outer2 = new MyOuter();
		//outer2.MyInner inner4 = outer2.new MyInner();  Not Allowed
		
	}

}
