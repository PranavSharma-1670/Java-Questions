// 6.	Synchronized Method: 
//	Create a ticket booking system where multiple
//	users (threads) attempt to book tickets simultaneously. 
//	Use synchronization to prevent overselling of tickets.
package assignment;

class TicketBooking {
    private int tickets = 5;

    public synchronized void bookTicket(String user) {
        if (tickets > 0) {
            System.out.println(user + " booked 1 ticket.");
            tickets--;
        } else {
            System.out.println("No tickets left for " + user);
        }
    }
}

public class Ques6_2 {
	public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();
        Runnable r = () -> booking.bookTicket(Thread.currentThread().getName());

        for (int i = 1; i <= 7; i++) {
            new Thread(r, "User-" + i).start();
        }
    }
}
