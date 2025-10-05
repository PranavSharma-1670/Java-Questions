// 6.	Daemon Threads: 
//	Write a Java program where a daemon thread 
//	continuously writes "Auto-Save in progress..." 
//	every 3 seconds, while the main thread performs 
//	a file processing task.
package assignment;

public class Ques6_1 {
	public static void main(String[] args) {
        Thread autoSave = new Thread(() -> {
            while (true) {
                System.out.println("Auto-Save in progress...");
                try { Thread.sleep(3000); } catch (InterruptedException e) {}
            }
        });
        autoSave.setDaemon(true);
        autoSave.start();

        System.out.println("Main thread doing file processing...");
        try { Thread.sleep(7000); } catch (InterruptedException e) {}
        System.out.println("Main thread finished");
    }
}
