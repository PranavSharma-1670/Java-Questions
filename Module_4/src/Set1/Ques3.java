//3.	Write a program to iterate over a List of integers using: 
//a.	A simple for loop
//b.	An enhanced for loop
//c.	A while loop with an Iterator
package Set1;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class Ques3 {
	public static void main(String[] args) {
		Integer[] data = {1,2,3,4,5,6,7,8,9};
		List<Integer> lt1 = Arrays.asList(data);
		
		for (int i = 0; i < lt1.size() ; i++) {
			  System.out.print(lt1.get(i)+ ", ");
		}
		
		System.out.println();
		
		for (int number: lt1) {
			  System.out.print(number+ ", ");
		}
		
		System.out.println();
		
		Iterator<Integer> it = lt1.iterator();
		while (it.hasNext()) {
		    System.out.print(it.next()+ ", ");
		}
	}
}
