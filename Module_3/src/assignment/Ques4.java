// 4.	Thread Sleep with Multiple Threads (Countdown Timer): 
//	Write a program where one thread prints a countdown 
//	from 10 to 1 (1-second delay), while another thread 
//	simultaneously prints "Tick..." every half a second.
package assignment;

public class Ques4 {
	public static void main(String[] args) {
        Thread countdown = new Thread(() -> {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Countdown: " + i);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });

        Thread tick = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("Tick...");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        tick.start();
        countdown.start();
    }
}
