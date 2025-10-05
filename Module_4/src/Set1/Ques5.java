//5.	Write a program to sort an ArrayList of strings alphabetically and reverse alphabetically.
package Set1;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;

class StrComparator1 implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
//		return o2.length() - o1.length(); // Size Wise
		return o1.compareTo(o2); 
	}
}

class StrComparator2 implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
//		return o1.length() - o2.length(); // Size Wise
		return o2.compareTo(o1); 
	}
}

public class Ques5 {
	public static void main(String[] args) {
		ArrayList<String> lt1 = new ArrayList<>();
		lt1.add("Pranav");
		lt1.add("Paridhi");
		lt1.add("Suraj");
		lt1.add("Raghav");
		
		for (String name: lt1) {System.out.print(name+ ", ");}
		System.out.println();
		
//		Collections.sort(lt1);
//		for (String name: lt1) {System.out.print(name+ ", ");}
//		System.out.println();
//		
//		Collections.sort(lt1, Collections.reverseOrder());
//		for (String name: lt1) {System.out.print(name+ ", ");}
//		System.out.println();
		
		lt1.sort(new StrComparator1());
		for (String name: lt1) {System.out.print(name+ ", ");}
		System.out.println();
		
		lt1.sort(new StrComparator2());
		for (String name: lt1) {System.out.print(name+ ", ");}
		System.out.println();
		
	}
}
