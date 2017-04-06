package chapter9.Synchronization;

public class Deadlock {

	public static void main(String args[]) {
		DeadlockRisk r1 = new DeadlockRisk();
		DeadlockRisk w1 = new DeadlockRisk();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.setName("Read");
		t2.setName("Write");
		t2.start();
		t1.start();
	}

}

class DeadlockRisk implements Runnable {
	private static class Resource {
		public int value;
	}

	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();

	public int read() {
		synchronized (resourceA) { // May deadlock here
			try {
				Thread.currentThread().sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resourceB) {
				return resourceB.value + resourceA.value;
			}
		}
	}

	public void write(int a, int b) {
		synchronized (resourceB) { // May deadlock here
			try {
				Thread.currentThread().sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resourceA) {

				resourceA.value = a;
				resourceB.value = b;
			}
		}
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Write")) {
			write(10, 20);
		} else {
			System.out.println(read());
		}

	}
}