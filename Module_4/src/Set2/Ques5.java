//5.	Write a program to demonstrate the sorted order of keys in TreeMap by adding unsorted key-value pairs. 
package Set2;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ques5 {
	public static void main(String[] args) {
        // Create a TreeMap (which stores keys in sorted order)
        TreeMap<Integer, String> students = new TreeMap<>();

        // Add unsorted key-value pairs
        students.put(105, "Suraj");
        students.put(101, "Simran");
        students.put(103, "Pranav");
        students.put(104, "Nandika");
        students.put(102, "Naman");

        // Display the unsorted insertion order (if needed)
        System.out.println("🔹 Unsorted Insertion Order (Using HashMap for reference):");
        Map<Integer, String> unsorted = new HashMap<>(students);
        for (Map.Entry<Integer, String> entry : unsorted.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("\n🔹 Sorted Order (Automatically maintained by TreeMap):");
        // Display the TreeMap (sorted order)
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Optional: show first and last keys for clarity
        System.out.println("\nFirst Key: " + students.firstKey());
        System.out.println("Last Key: " + students.lastKey());
    }
}
