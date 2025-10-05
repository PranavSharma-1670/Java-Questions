// 19.	Listing All Files in a Directory: 
//	Write a Java program that lists all files 
//	in a directory specified by the user. The 
//	program should handle exceptions appropriately.
package assignment;
import java.io.File;

public class Questions19 {
	public static void main(String[] args) {
        File directory = new File("src");

        if (directory.isDirectory()) {
            String[] files = directory.list();
            System.out.println("Files in directory : - ");
            if (files != null) {
                for (String name : files) {
                    System.out.println(name);
                }
            }
        } else {
            System.out.println("Not a valid directory.");
        }
    }
}
