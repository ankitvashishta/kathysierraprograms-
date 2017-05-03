package chapter9.ThreadInteraction;

public class SynchronizeAndWaitOnDifferentObjects {

	public static void main(String args[]) {
		Thread thread1 = new Thread(new ClassToNotify());
		thread1.start();
		synchronized (thread1) {
			try {
				thread1.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class ClassToNotify implements Runnable {
	StringBuffer str = new StringBuffer();

	@Override
	public void run() {
		int i;
		synchronized (str) {
			System.out.println("This block synchronizes on StringBuffer object and calls"
					+ " notify on 'this' ie. currently executing object.");
			System.out.println("A runtime exception would be thrown - 'IllegalMonitorStateException'");
			for (i = 0; i < 10; i++) {
				i++;
			}
			System.out.println("The Sum is : " + i);
			notify();
		}
	}
}
