package chapter9.Threads;

class ThreadImplementor implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			System.out.println("This is the no : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 10 == 0) {
				System.out.println("Hello");
			}
		}

	}

}

public class PracticeExercise {

	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getPriority());
		ThreadImplementor thread1 = new ThreadImplementor();
		Thread t = new Thread(thread1);
		t.setPriority(8);
		System.out.println(t.getPriority());
		t.start();
	}

}
