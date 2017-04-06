package chapter9.Synchronization;

public class AccountDangerSynchronized implements Runnable {
	private AccountSynchronized acct = new AccountSynchronized();

	public static void main(String[] args) {
		AccountDangerSynchronized r = new AccountDangerSynchronized();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();
	}

	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("Account is overdrawn!");
			}
		}
	}

	private synchronized void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName()
					+ " is going to withdraw " + acct.getBalance());
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName()
					+ " completes the withdrawal " + acct.getBalance());
		} else {
			System.out.println("Not enough in Account for "
					+ Thread.currentThread().getName() + " to withdraw "
					+ acct.getBalance());
		}
	}
}

class AccountSynchronized{
	
	int balance = 50;
	
	public void withdraw(int balance){
		this.balance = this.balance - balance;
		setBalance(this.balance);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}