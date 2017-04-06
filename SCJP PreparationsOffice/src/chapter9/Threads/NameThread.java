package chapter9.Threads;

class NameRunnable implements Runnable {
	public void run() {
		System.out.println("NameRunnable running");
		System.out.println("Run by " + Thread.currentThread().getName());
	}
}

public class NameThread {
	public static void main(String[] args) {
		System.out.println("thread is " + Thread.currentThread().getName());
		NameRunnable nr = new NameRunnable();
		Thread t = new Thread(nr);
		t.run();
		t.setName("Fred");
		System.out.println("The name is : " + t.getName() + " "	+ Thread.currentThread().getName());
		t.start();
	}
}