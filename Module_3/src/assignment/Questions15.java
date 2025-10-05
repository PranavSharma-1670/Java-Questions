// 15.	Reading a File Using Character Stream: 
//	Write a program that reads a file using the 
//	FileReader class and prints the contents of 
//	the file to the console.
package assignment;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questions15 {
	public static void main(String[] args) {

		String fileName = "src/files/consoleoutput.txt";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileOutputStream fos = new FileOutputStream(fileName)) {
			System.out.println("Enter text to write into the file:");
			String input = br.readLine(); // read one line of input

			// Write to file
			fos.write(input.getBytes());

			System.out.println("Data written to " + fileName + " successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
