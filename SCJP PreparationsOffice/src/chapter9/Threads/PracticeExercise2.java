package chapter9.Threads;

public class PracticeExercise2 extends Thread {

	StringBuffer strBuffer;

	public PracticeExercise2(StringBuffer buffer) {
		this.strBuffer = buffer;
	}

	public void run() {
		synchronized (strBuffer) {						// synchronized (PracticeExercise2.class) can also be used.
			for (int i = 0; i < 10; i++) {
				System.out.println(strBuffer.toString());
			}
			char a = strBuffer.charAt(0);
			a++;
			strBuffer.setCharAt(0, a);

		}
	}

	public static void main(String args[]) {
		StringBuffer buf = new StringBuffer();
		buf.append('A');
		PracticeExercise2 thread1 = new PracticeExercise2(buf);
		PracticeExercise2 thread2 = new PracticeExercise2(thread1.strBuffer);
		PracticeExercise2 thread3 = new PracticeExercise2(thread2.strBuffer);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
