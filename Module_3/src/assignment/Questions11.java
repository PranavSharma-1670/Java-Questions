// 11.	Write a Java program using the ReentrantLock class to 
// create a simple counter that can be safely incremented by 
// multiple threads. Compare the result with the version that 
// does not use a lock.
package assignment;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    // Without lock (unsafe)
    public void incrementUnsafe() {
        count++;
    }
    // With lock (safe)
    private ReentrantLock lock = new ReentrantLock();
    public void incrementSafe() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

public class Questions11 {
	public static void main(String[] args) throws InterruptedException {
        Counter counterUnsafe = new Counter();
        Counter counterSafe = new Counter();

        Runnable taskUnsafe = () -> {
            for (int i = 0; i < 1000; i++) counterUnsafe.incrementUnsafe();
        };

        Runnable taskSafe = () -> {
            for (int i = 0; i < 1000; i++) counterSafe.incrementSafe();
        };

        Thread t1 = new Thread(taskUnsafe);
        Thread t2 = new Thread(taskUnsafe);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final Count (Unsafe): " + counterUnsafe.getCount());

        Thread t3 = new Thread(taskSafe);
        Thread t4 = new Thread(taskSafe);
        t3.start(); t4.start();
        t3.join(); t4.join();
        System.out.println("Final Count (Safe): " + counterSafe.getCount());
    }
}
