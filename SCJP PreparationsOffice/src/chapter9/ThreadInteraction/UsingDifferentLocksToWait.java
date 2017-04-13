package chapter9.ThreadInteraction;

public class UsingDifferentLocksToWait {

	public static void main(String args[]) {
		Thread thread1 = new Thread(new ThreadToNotify());
		thread1.start();

		synchronized (thread1) {
			System.out.println("Waiting for incorrect object. Should throw exception.");
			try {
				thread1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class ThreadToNotify implements Runnable {
	StringBuffer str = new StringBuffer();

	@Override
	public void run() {
		synchronized (str) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
			notify();
		}
	}
}