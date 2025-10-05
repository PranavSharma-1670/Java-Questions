//5. Stopping a Thread: Write a program that
//safely stops a thread using a flag. The 
//thread should print numbers from 1 to 100,
//and the program should be able to stop the 
//thread by setting the flag to false.

package lab_set_2;

class NumberPrinter implements Runnable {
  private volatile boolean running = true;

  public void stop() {
      running = false;
  }

  @Override
  public void run() {
      int i = 1;
      while (running && i <= 100) {
          System.out.println(i++);
          try { Thread.sleep(100); } catch (InterruptedException e) {}
      }
      System.out.println("Thread stopped safely.");
  }
}

public class Ques5 {
  public static void main(String[] args) throws InterruptedException {
      NumberPrinter printer = new NumberPrinter();
      Thread t = new Thread(printer);
      t.start();

      Thread.sleep(1000); // Let it print for a while
      printer.stop();
  }
}
