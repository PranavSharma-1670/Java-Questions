// 5.	Thread Naming and Priority: 
//	Write a Java program that creates three 
//	threads: "Worker-1", "Worker-2", and "Worker-3".
//	Assign different priorities and print messages 
//	from each thread showing their execution order.
package assignment;

public class Ques5 {
	public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Running " + Thread.currentThread().getName()), "Worker-1");
        Thread t2 = new Thread(() -> System.out.println("Running " + Thread.currentThread().getName()), "Worker-2");
        Thread t3 = new Thread(() -> System.out.println("Running " + Thread.currentThread().getName()), "Worker-3");

        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start(); 
        t2.start(); 
        t3.start();
    }
}
