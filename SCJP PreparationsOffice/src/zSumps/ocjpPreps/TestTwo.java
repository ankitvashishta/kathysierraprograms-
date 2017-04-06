package zSumps.ocjpPreps;

public class TestTwo extends Thread{
	
	public static void main(String args[]) throws InterruptedException{
		TestTwo t = new TestTwo();
		t.start();
		
		t.run();
		t.join();
		t.doIt();
		
	}
	
	public void run(){
		System.out.print("Run ");
	}
	
	public void doIt(){
		System.out.print("doIt ");
	}
	

}
