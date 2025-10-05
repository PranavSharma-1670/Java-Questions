// 14.	Writing to a File Using Byte Stream: 
//	Create a program that writes a string into 
//	a file using the FileOutputStream. Ensure that 
//	the program writes the string "Java I/O Streams "
//			+ "Example" to a file named output.txt.
package assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Questions14 {
	public static void main(String[] args) {

		String file = "src/files/output.txt";
		String data = "Writing in Java File";
		try (FileOutputStream fis = new FileOutputStream(file)) {

			fis.write(data.getBytes());

		} catch (FileNotFoundException e) {
			System.out.println("Error reading file: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		System.out.println("Done");

	}
}
