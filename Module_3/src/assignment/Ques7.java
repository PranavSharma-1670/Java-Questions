// 7.	Synchronized Block: 
//	Create an inventory management program where 
//	multiple threads decrease the stock count of a 
//	product. Use a synchronized block to ensure 
//	stock updates are thread-safe.
package assignment;

class Inventory {
    private int stock = 5;
    public void reduceStock(String user) {
        synchronized (this) {
            if (stock > 0) {
                System.out.println(user + " bought 1 item.");
                stock--;
            } else {
                System.out.println("Out of stock for " + user);
            }
        }
    }
}

public class Ques7 {
	public static void main(String[] args) {
        Inventory inv = new Inventory();
        Runnable r = () -> inv.reduceStock(Thread.currentThread().getName());

        for (int i = 1; i <= 12; i++) {
            new Thread(r, "User-" + i).start();
        }
    }
}
