package zSumps.ocjpPreps;

public class PingPongTester implements Runnable {
	synchronized void hit(long n) {
		for (int i = 1; i < 3; i++)
			System.out.print(n + "-" + i + " ");
	}

	public static void main(String[] args) {
		new Thread(new PingPongTester()).start();
		new Thread(new PingPongTester()).start();
	}

	public void run() {
		hit(Thread.currentThread().getId());
	}
}