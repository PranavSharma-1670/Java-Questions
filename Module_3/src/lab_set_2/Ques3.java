//3. Thread Deadlock: Write a program that simulates
//a deadlock condition. Create two threads that
//attempt to lock two different resources and
//cause a deadlock.
package lab_set_2;

public class Ques3 {
	public static final Object obj1 = new Object();
	public static final Object obj2 = new Object();
	
	public static void main(String[] args) {
		Thread Thread1 = new Thread(() -> {
			synchronized (obj1) {
				System.out.println(" Thread 1 is holding Obj 1.");
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					System.err.println(" Error occured : " + e);
				}
				System.out.println(" Thread 1 is waiting for lock on Obj 2.");
				synchronized(obj2) {
					System.out.println(" Thread 1 is now holding Obj 2.");
				}
			}
		});
		
		Thread Thread2 = new Thread(() -> {
			synchronized (obj2) {
				System.out.println(" Thread 2 is holding Obj 2.");
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					System.err.println(" Error occured : " + e);
				}
				System.out.println(" Thread 2 is waiting for lock on Obj 1.");
				synchronized(obj1) {
					System.out.println(" Thread 2 is now holding Obj 1.");
				}
			}
		});
		
		Thread Thread3 = new Thread(() -> {
			for (int i=0;i<10;i++) {
				System.out.println(" Waiting");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.err.println(" Error Occured : " + e);
				}
			}
		});
	
		Thread1.start();
		Thread2.start();
		Thread3.start();
		
	}
}
