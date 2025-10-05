// 24.	Using java.util Package (Date and Calendar Example): 
//	Write a program that uses the Date and Calendar 
//	classes to display the current date and time.
package assignment;
import java.util.Date;
import java.util.Calendar;

public class Questions24 {
	public static void main(String[] args) {
        // Current date and time
        Date date = new Date();
        System.out.println("Current Date: " + date);

        // Using Calendar
        Calendar cal = Calendar.getInstance();
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1)); // start from 0
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
        System.out.println("Second: " + cal.get(Calendar.SECOND));
    }
}
