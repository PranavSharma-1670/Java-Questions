//8.	Deadlock Example with Dining Philosophers: 
//	Simulate a simple Dining Philosophers problem where two 
//	philosophers try to pick up chopsticks (resources) and create a deadlock situation.
package assignment;

class Chopstick {}

class Philosopher extends Thread {
    private Chopstick left, right;
    private String name;

    public Philosopher(String name, Chopstick left, Chopstick right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public void run() {
        synchronized (left) {
            System.out.println(name + " picked up left chopstick.");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (right) {
                System.out.println(name + " picked up right chopstick.");
                System.out.println(name + " is eating.");
            }
        }
    }
}

public class Ques8 {
	public static void main(String[] args) {
        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();

        Philosopher p1 = new Philosopher("Philosopher-1", c1, c2);
        Philosopher p2 = new Philosopher("Philosopher-2", c2, c1);

        p1.start();
        p2.start();
    }
}
