//4.	Create a List of strings and perform the following operations: 
//a.	Add elements to the list.
//b.	Remove an element by value and index.
//c.	Replace an element at a specific index.
//d.	Print the list after each operation.
package Set1;
import java.util.ArrayList;
import java.util.List;

public class Ques4 {
	public static void main(String[] args) {
	List<String> lt1 = new ArrayList<>();
	lt1.add("Pranav");
	lt1.add("Paridhi");
	lt1.add("Suraj");
	lt1.add("Raghav");
	
	for (String name: lt1) {System.out.print(name+ ", ");}
	System.out.println();
	
	lt1.remove("Raghav");
	
	for (String name: lt1) {System.out.print(name+ ", ");}
	System.out.println();
	
	lt1.set(2,"Suraj Bhan Rawat");
	
	for (String name: lt1) {System.out.print(name+ ", ");}
	System.out.println();
	}
}
