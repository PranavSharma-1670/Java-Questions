// 21.	Deleting a File: Write a Java program that deletes a file from the system using the File class.
package assignment;
import java.io.File;

public class Questions21 {
	public static void main(String[] args) {
        File file = new File("src/files/delete_me.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully!");
            } else {
                System.out.println("Failed to delete file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
