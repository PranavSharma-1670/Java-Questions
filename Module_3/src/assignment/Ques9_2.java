// 9.	Using wait(), notify(), and notifyAll(): 
//		2.	Write a program where two threads print 
//			numbers from 1 to 20 alternately: one prints 
//			odd numbers, and the other prints even numbers. 
//			Use wait() and notify() for synchronization.

package assignment;

class Printer {
    private boolean oddTurn = true;

    public synchronized void printOdd(int num) throws InterruptedException {
        while (!oddTurn) wait();
        System.out.println(num);
        oddTurn = false;
        notify();
    }

    public synchronized void printEven(int num) throws InterruptedException {
        while (oddTurn) wait();
        System.out.println(num);
        oddTurn = true;
        notify();
    }
}

public class Ques9_2 {
	public static void main(String[] args) {
        Printer printer = new Printer();

        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 19; i += 2) {
                try { printer.printOdd(i); } catch (Exception e) {}
            }
        });

        Thread even = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                try { printer.printEven(i); } catch (Exception e) {}
            }
        });

        odd.start();
        even.start();
    }
}
