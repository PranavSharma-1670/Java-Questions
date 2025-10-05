// 12.	Write a program where two threads acquire two locks 
// (lock1 and lock2) in opposite order, causing a deadlock. 
// Then, fix the deadlock by using tryLock() with timeout.
package assignment;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class FixedDeadlockTask implements Runnable {
    private Lock lock1;
    private Lock lock2;

    public FixedDeadlockTask(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        try {
            while (true) {
                if (lock1.tryLock(100, TimeUnit.MILLISECONDS)) {
                    try {
                        if (lock2.tryLock(100, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println(Thread.currentThread().getName() + " acquired both locks safely");
                                break;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } finally {
                        lock1.unlock();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " retrying...");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Questions12_fixed {
	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread(new FixedDeadlockTask(lock1, lock2), "Thread-1");
        Thread t2 = new Thread(new FixedDeadlockTask(lock2, lock1), "Thread-2");

        t1.start();
        t2.start();
    }
}
