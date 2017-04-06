package chapter9.Threads;

public class Test extends Thread {

	public void getCount() {
		synchronized (Test.class) {
			System.out.println("Hello");
		}
	}

}
