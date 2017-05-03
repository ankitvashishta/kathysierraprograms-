package chapter9.ThreadInteraction;

public class UsingDifferentLocksToWait {

	public static void main(String args[]) {
		UsingDifferentLocksToWait usingDifferentLocksToWait = new UsingDifferentLocksToWait();
		Thread thread1 = new Thread(new ThreadToNotify());
		thread1.start();

		synchronized (usingDifferentLocksToWait) {
			System.out.println(
					"Waiting on an object and receive notification from other." + " Would keep waiting forever....");
			synchronized (usingDifferentLocksToWait) {
				System.out.println("Waiting for incorrect object. Should throw exception.");
				try {
					usingDifferentLocksToWait.wait();
					System.out.println("This won't be executed ever. Alas! Dead code.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

class ThreadToNotify implements Runnable {
	StringBuffer str = new StringBuffer();

	@Override
	public void run() {
		int i;
		synchronized (this) {
			for (i = 0; i < 10; i++) {
				i++;
			}
			System.out.println("The Sum is : " + i);
			notify();
		}
	}

}