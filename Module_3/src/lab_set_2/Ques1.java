//1.	Synchronized Method: Create a Java program 
//where two threads try to update the same bank account 
//balance. Use synchronization to ensure the balance is 
//updated correctly and avoid race conditions.
package lab_set_2;

//class BankAccount{
//	private int balance;
//	
//	public BankAccount(int balance) {
//		this.balance = balance;
//	}
//	
//	public void deposit(int amount) {
//		balance += amount;
//     System.out.println(Thread.currentThread().getName() + ", deposited " + amount + ", Balance : " + balance + ".");
//	}
//	
//	public void withdraw(int amount) {
//		if (balance < amount) {
//			System.out.println(Thread.currentThread().getName() +" execution failed. Not enough Balance.");
//		} else {
//			balance -= amount;
//			System.out.println(Thread.currentThread().getName() + ", withdrawn " + amount + ", Balance : " + balance + ".");
//		}
//	}
//	
//	public int getBalance() {
//     return balance;
// }
//}
//
//class CustomerTake extends Thread{
//	private BankAccount account;
//
// public CustomerTake(BankAccount account) {
//     this.account = account;
// }
//
// @Override
// public void run() {
// 	for (int i=0;i<10;i++) { account.withdraw(50); }
// }
//}
//
//class CustomerPut extends Thread{
//	private BankAccount account;
//
// public CustomerPut(BankAccount account) {
//     this.account = account;
// }
//
// @Override
// public void run() {
// 	for (int i=0;i<10;i++) { account.deposit(100); }
// }
//}
//
//public class Ques1 {
//	private static BankAccount account = new BankAccount(500); 
//	public static void main(String[] args) {
//		System.out.println(" Initial Amount : " + account.getBalance());
//		
//		CustomerTake take1 = new CustomerTake(account);
//		CustomerPut put1 = new CustomerPut(account);
//		take1.start();
//		put1.start();
//		
//		try { take1.join(); put1.join(); }
//		catch (InterruptedException e){
//			System.err.println(" Error : " + e);
//		}
//		
//		System.out.println(" Final Amount : " + account.getBalance());
//	}
//}

//-------------------------------------------------------------------------------

class BankAccount{
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public synchronized void deposit(int amount) {
		balance += amount;
     System.out.println(" " + Thread.currentThread().getName() + ", deposited " + amount + ", Balance : " + balance + ".");
	}
	
	public synchronized void withdraw(int amount) {
		if (balance < amount) {
			System.out.println(" " + Thread.currentThread().getName() +" execution failed. Not enough Balance.");
		} else {
			balance -= amount;
			System.out.println(" " + Thread.currentThread().getName() + ", withdrawn " + amount + ", Balance : " + balance + ".");
		}
	}
	
	public int getBalance() {
     return balance;
 }
}

class CustomerTake extends Thread{
	private BankAccount account;

 public CustomerTake(BankAccount account) {
     this.account = account;
 }

 @Override
 public void run() {
 	for (int i=0;i<10;i++) { account.withdraw(50); }
 }
}

class CustomerPut extends Thread{
	private BankAccount account;

 public CustomerPut(BankAccount account) {
     this.account = account;
 }

 @Override
 public void run() {
 	for (int i=0;i<10;i++) { account.deposit(100); }
 }
}

public class Ques1 {
	private static BankAccount account = new BankAccount(500); 
	public static void main(String[] args) {
		System.out.println(" Initial Amount : " + account.getBalance());
		
		CustomerTake take1 = new CustomerTake(account);
		CustomerPut put1 = new CustomerPut(account);
		put1.start();
		take1.start();
		
		try { take1.join(); put1.join(); }
		catch (InterruptedException e){
			System.err.println(" Error : " + e);
		}
		
		System.out.println(" Final Amount : " + account.getBalance());
	}
}
