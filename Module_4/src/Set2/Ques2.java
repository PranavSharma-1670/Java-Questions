//2.	Reverse a Linked List
//Write a function to reverse a singly linked list in place.
//Example: 1 → 2 → 3 → 4 → 4 → 3 → 2 → 1
package Set2;
import java.util.LinkedList;

public class Ques2 {
	
//	public static void ReverseSinglyLinkedList( LinkedList<Integer> list) {
//		int n = list.size();
//		Integer[] temparr = new Integer[n];
//		
//		for (int i = 0; i<n; i++) {
//			temparr[n-i-1] = list.get(i);
//		}
//		
//		for (int number: temparr) {
//			  System.out.print(number + " ");
//			}
//	}
	
	public static LinkedList<Integer> ReverseSinglyLinkedList( LinkedList<Integer> list) {
		int n = list.size();
		LinkedList<Integer> templis = new LinkedList<>();
		
		for (int i = n-1; i>=0; i--) {
			templis.add(list.get(i));
		}
		
//		for (int number: templis) {
//			  System.out.println(number + " ");
//			}
		return templis;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(3);
		l1.add(7);
		l1.add(9);
		l1.add(27);
		l1.add(108);
		
		System.out.println(l1);
		System.out.println(l1.size());
		
		l1 = ReverseSinglyLinkedList(l1);
		System.out.println(l1);
		
	}
}
