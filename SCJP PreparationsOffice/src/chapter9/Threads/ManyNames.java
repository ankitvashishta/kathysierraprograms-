package chapter9.Threads;

class NameRunnable1 implements Runnable {
	public void run() {
		//they don't affect the	instance t instead they are defined to always affect the thread that's currently executing.
		if(Thread.currentThread().getName().equals("Ricky")){
			try {
				Thread.currentThread().sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int x = 1; x <= 10; x++) {
			System.out.println("Run by " + Thread.currentThread().getName()
					+ ", x is " + x);
		}
	}
}

public class ManyNames {
	public static void main(String[] args) throws InterruptedException {
		// Make one Runnable
		NameRunnable1 nr = new NameRunnable1();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		Thread four = new Thread("a");
		//four.start();
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		one.start();
		two.start();
		three.start();
		
		//one.start();
	}
}