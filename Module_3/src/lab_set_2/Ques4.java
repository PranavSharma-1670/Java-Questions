//4. Using wait(), notify(), and notifyAll(): Implement 
//a producer-consumer scenario where one thread 
//(producer) produces data and another thread (consumer)
//consumes it. Use the wait() and notify() methods for synchronization.
package lab_set_2;

class SharedResouces{
	boolean hasGoods = false;
	int TotalGoods = 0;
	
	public synchronized void producer(int val){
		while(hasGoods) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println(" Error Occured : " + e);
			}
		}
		hasGoods = true;
		TotalGoods = val;
		notify();
	}
	
	public synchronized void consumer(int val){
		while(!hasGoods) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println(" Error Occured : " + e + ".");
			}
		}
		hasGoods = false;
		TotalGoods = val;
		notify();
	}
}

class Producer extends Thread{
	SharedResouces resouces;
	public Producer(SharedResouces resouces) {
		this.resouces = resouces;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			resouces.producer(i);
			System.out.println(" Producer has produced.");
		}
	}
}

class Consumer extends Thread{
	SharedResouces resouces;
	public Consumer(SharedResouces resouces) {
		this.resouces = resouces;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			resouces.consumer(i);
			System.out.println(" Consumer has consumed.");
		}
	}
}

public class Ques4 {
	public static void main(String[] args) {
		SharedResouces resource = new SharedResouces();

		Thread producerThread = new Thread(new Producer(resource));
		Thread consumerThread = new Thread(new Consumer(resource));
		producerThread.start();
		consumerThread.start();

	}
}
