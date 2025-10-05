// 9.	Using wait(), notify(), and notifyAll(): 
//		1.	Implement a producer-consumer scenario where one thread 
//			(producer) produces data and another thread (consumer) consumes it. 
//			Use the wait() and notify() methods for synchronization.

package assignment;

class Resources {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) wait();
        data = value;
        System.out.println("Produced: " + value);
        hasData = true;
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasData) wait();
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();
        return data;
    }
}

public class Ques9_1 {
	public static void main(String[] args) {
        Resources Res = new Resources();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { Res.produce(i); Thread.sleep(500); } catch (Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                	Res.consume();
                	Thread.sleep(800);
                } catch (Exception e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}
