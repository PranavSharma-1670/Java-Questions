//3.	Write a program to demonstrate the use of TreeMap for sorting keys.
package Set2;
import java.util.TreeMap;

public class Ques3 {
	public static void main(String[] args) {
		TreeMap<Integer,String> l1 = new TreeMap<>();
		
		l1.put(27,"Pranav");
		l1.put(9,"Shubh");
		l1.put(3,"Divya");
		l1.put(5,"Diksha");
		
		System.out.println(l1.keySet());
	}
}
