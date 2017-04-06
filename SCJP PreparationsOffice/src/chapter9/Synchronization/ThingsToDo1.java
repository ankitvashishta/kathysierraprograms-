package chapter9.Synchronization;

public class ThingsToDo1 {

	public static void main(String args[]){
		Runnable r = new ClassToBeSynchronized();
		Thread t = new Thread(r);
		t.start();
		Thread t1 = new Thread(r);
		t1.start();
	}
}

class ClassToBeSynchronized implements Runnable{

	@Override
	public void run() {
	
		method1();
		method2();
	}
	
	public synchronized void method1(){
		System.out.println("Inside method1");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method1 after sleep");
	}
	
	
	public synchronized void method2(){
		System.out.println("Inside method2");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method2 after sleep");
	}
}