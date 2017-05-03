package chapter9.ThreadInteraction;

public class UsingDifferentLocksToWait {

	public static void main(String args[]) {
		UsingDifferentLocksToWait usingDifferentLocksToWait = new UsingDifferentLocksToWait();
		Thread thread1 = new Thread(new ThreadToNotify());
		thread1.start();

		synchronized (usingDifferentLocksToWait) {
			System.out.println("Waiting for incorrect object. Should throw exception.");
			try {
				usingDifferentLocksToWait.wait();
				System.out.println("Inside wait");
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
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
			notify();
		}
	}
}