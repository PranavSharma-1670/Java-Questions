// 2.	Create a thread by implementing the Runnable interface: 
//	Create a thread by implementing the Runnable interface 
//	that takes a string "MULTITHREADING" and prints its 
//	characters in reverse order one by one.
package assignment;

class ReverseRunnable implements Runnable {
    public void run() {
        String str = "MULTITHREADING";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class Ques2 {
	public static void main(String[] args) {
        new Thread(new ReverseRunnable()).start();
    }
}
