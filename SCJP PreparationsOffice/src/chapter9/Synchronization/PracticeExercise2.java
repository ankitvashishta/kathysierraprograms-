package chapter9.Synchronization;

public class PracticeExercise2 {
	public static void main(String args[]) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append('A');
		SynchronizedBlock thread1 = new SynchronizedBlock(stringBuffer);
		SynchronizedBlock thread2 = new SynchronizedBlock(stringBuffer);
		SynchronizedBlock thread3 = new SynchronizedBlock(stringBuffer);
		thread1.setName("Fred");
		thread2.setName("Lucy");
		thread3.setName("Ricky");
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

class SynchronizedBlock extends Thread {

	StringBuffer stringBuffer = new StringBuffer();

	public SynchronizedBlock(StringBuffer stringBuffer) {
		this.stringBuffer = stringBuffer;
	}

	@Override
	public void run() {
		synchronized (stringBuffer) {
			for (int i = 0; i < 100; i++) {
				System.out.println(stringBuffer.toString() + " " + Thread.currentThread().getName());
			}
			char c = stringBuffer.charAt(0);
			c = (char) (c+1);
			stringBuffer.setCharAt(0, c);
			System.out.println("Thread completes");
		}
	}
}