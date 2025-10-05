// 4.	Write a program to create a HashMap of employee IDs and names. Perform the following operations: 
//   a.	Add new key-value pairs.
//   b.	Check if a key exists.
//   c.	Iterate through the map using: 
//   d.	KeySet
//   e.	EntrySet
package Set2;
import java.util.HashMap;
import java.util.Map.Entry;

public class Ques4 {
	public static void main(String[] args) {
		HashMap<Integer,String> l1 = new HashMap<>();
		
		System.out.println("Add new key-value pairs.");
		
		l1.put(1027,"Pranav");
		l1.put(1009,"Shubh");
		l1.put(1003,"Divya");
		l1.put(1005,"Diksha");
		
		System.out.println(l1);
		
		System.out.println("Check if a key exists");
		System.out.println(l1.keySet());
		
		System.out.println("Iterate through the map using: KeySet");
		for (Integer value : l1.keySet()) {
		    System.out.println(l1.get(value));
		}
		
		System.out.println("Iterate through the map using: EntrySet");
		for (Entry<Integer, String> value : l1.entrySet()) {
		    System.out.println(value.getValue());
		}
	}
}
