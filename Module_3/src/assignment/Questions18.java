// 18.	File Existence Check: 
//	Write a program that checks if a 
//	file exists in the system. If the 
//	file does not exist, create the file 
//	using the File class.
package assignment;
import java.io.File;
import java.io.IOException;

public class Questions18 {
	public static void main(String[] args) {
        try {
            File file = new File("src/files/consoleoutput.txt");
            if (file.exists()) {
                System.out.println("File already exists: " + file.getAbsolutePath());
            } else {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getAbsolutePath());
                } else {
                    System.out.println("Failed to create file.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
