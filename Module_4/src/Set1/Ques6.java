//6.	Write a program to sort a list of custom objects 
//(e.g., Student with name and marks) using a Comparator.
package Set1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int marks;
	
	Student(String name,int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String toString(){
		return name + "(" + marks +")";
	}
}

//Comparator to sort by marks (descending)
class MarksComparator implements Comparator<Student> {
public int compare(Student s1, Student s2) {
  return Integer.compare(s2.marks, s1.marks); // descending order
}
}

//Comparator to sort by name (ascending)
class NameComparator implements Comparator<Student> {
public int compare(Student s1, Student s2) {
  return s1.name.compareTo(s2.name);
}
}

public class Ques6 {
	public static void main(String[] args) {
     List<Student> students = new ArrayList<>();

     // Add some students
     students.add(new Student("Alice", 85));
     students.add(new Student("Bob", 92));
     students.add(new Student("Charlie", 78));
     students.add(new Student("David", 92));

     System.out.println("Original List:");
     System.out.println(students);

     // Sort by marks
     Collections.sort(students, new MarksComparator());
     System.out.println("\nSorted by Marks (descending):");
     System.out.println(students);

     // Sort by name
     Collections.sort(students, new NameComparator());
     System.out.println("\nSorted by Name (ascending):");
     System.out.println(students);
 }
}
