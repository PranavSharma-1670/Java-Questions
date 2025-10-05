//6.	Write a program to show the difference between HashMap 
//and LinkedHashMap in terms of iteration order

package Set2;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Ques6 {
	public static void main(String[] args) {
		HashMap<Integer,String> l1 = new HashMap<>();
		LinkedHashMap<Integer,String> l2 = new LinkedHashMap<>();
		
		l1.put(1003,"Divya");
		l1.put(1027,"Pranav");
		l1.put(1009,"Shubh");
		l1.put(1005,"Diksha");
		
//		l1.put(127,"Pranav");
//		l1.put(109,"Shubh");
//		l1.put(103,"Divya");
//		l1.put(105,"Diksha");
		
//		l1.put(27,"Pranav");
//		l1.put(9,"Shubh");
//		l1.put(3,"Divya");
//		l1.put(5,"Diksha");
		
//		l1.put(10027,"Pranav");
//		l1.put(10009,"Shubh");
//		l1.put(10003,"Divya");
//		l1.put(10005,"Diksha");
		
		l2.put(1027,"Pranav");
		l2.put(1009,"Shubh");
		l2.put(1003,"Divya");
		l2.put(1005,"Diksha");
		
//		l2.put(27,"Pranav");
//		l2.put(9,"Shubh");
//		l2.put(3,"Divya");
//		l2.put(5,"Diksha");
		
		System.out.println(l1);
		System.out.println(l2);
		
		
		
		HashMap<String,Integer> l3 = new HashMap<>();
		LinkedHashMap<String,Integer> l4 = new LinkedHashMap<>();
		
		l3.put("B", 2);		
		l3.put("D", 4);
		l3.put("C", 3);
		l3.put("A", 1);
		
		l4.put("B", 2);
		l4.put("D", 4);
		l4.put("C", 3);
		l4.put("A", 1);
		
		System.out.println(l3);
		System.out.println(l4);
		
		
		

	}
	
	
//	public static void main(String[] args) {
//     Map<String, Integer> hashMap = new HashMap<>();
//     hashMap.put("C", 3);
//     hashMap.put("A", 1);
//     hashMap.put("B", 2);
//
//     Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
//     linkedHashMap.put("C", 3);
//     linkedHashMap.put("A", 1);
//     linkedHashMap.put("B", 2);
//
//     System.out.println("HashMap iteration order (unsorted, unpredictable):");
//     for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
//         System.out.println(entry.getKey() + " => " + entry.getValue());
//     }
//
//     System.out.println("\nLinkedHashMap iteration order (insertion order):");
//     for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
//         System.out.println(entry.getKey() + " => " + entry.getValue());
//     }
// }
}
