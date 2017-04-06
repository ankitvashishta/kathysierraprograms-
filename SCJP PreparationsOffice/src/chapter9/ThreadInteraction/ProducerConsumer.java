package chapter9.ThreadInteraction;

public class ProducerConsumer {
	public static void main(String args[]) {
		Runnable r1 = new Producer();
		Runnable r2 = new Consumer((Producer) r1);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setName("Producer");
		t2.setName("Consumer");
		t2.start();
		t1.start();
		
		

	}

}

class Producer extends Thread {

	int j;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("The producer : " + i);
				j = i;
			}
			notify();
		}

	}

}

class Consumer extends Thread {
	Producer producer;

	Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		//producer.start();
		synchronized (producer) {
			try {
				producer.wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for (int i = 0; i < producer.j; i++) {
				System.out.println("The consumer : " + i);
			}
		}

	}

}