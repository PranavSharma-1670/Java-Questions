//2. Synchronized Block: Modify the above 
//program (bank account example) to use 
//a synchronized block instead of a synchronized method.
package lab_set_2;

class BankAccountBlock{
	private int balance;
	
	public BankAccountBlock(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		synchronized(this) { 
			balance += amount;
			System.out.println(" " + Thread.currentThread().getName() + ", deposited " + amount + ", Balance : " + balance + "."); 
		}
	}
	
	public void withdraw(int amount) {
		synchronized(this) {
			if (balance < amount) {
				System.out.println(" " + Thread.currentThread().getName() +" execution failed. Not enough Balance.");
			} else {
				balance -= amount;
				System.out.println(" " + Thread.currentThread().getName() + ", withdrawn " + amount + ", Balance : " + balance + ".");
			}
		}
	}
	
	public int getBalance() {
      return balance;
  }
}

class CustomerTakeBlock extends Thread{
	private BankAccountBlock account;

  public CustomerTakeBlock(BankAccountBlock account) {
      this.account = account;
  }

  @Override
  public void run() {
  	for (int i=0;i<10;i++) { account.withdraw(50); }
  }
}

class CustomerPutBlock extends Thread{
	private BankAccountBlock account;

  public CustomerPutBlock(BankAccountBlock account) {
      this.account = account;
  }

  @Override
  public void run() {
  	for (int i=0;i<10;i++) { account.deposit(100); }
  }
}

public class Ques2 {
	private static BankAccountBlock account = new BankAccountBlock(500); 
	public static void main(String[] args) {
		System.out.println(" Initial Amount : " + account.getBalance());
		
		CustomerTakeBlock take1 = new CustomerTakeBlock(account);
		CustomerPutBlock put1 = new CustomerPutBlock(account);
		put1.start();
		take1.start();
		
		try { put1.join(); take1.join();}
		catch (InterruptedException e){
			System.err.println(" Error : " + e);
		}
		
		System.out.println(" Final Amount : " + account.getBalance());
	}
}
