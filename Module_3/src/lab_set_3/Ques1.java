//1.	Write a program that reads a text file using the FileInputStream and prints the contents to the console.
package lab_set_3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ques1 {
	public static void main(String[] args) {
		String file = "src/files/testtextfile.txt";
		try (FileInputStream data = new FileInputStream(file)) {
			int i;
			while ((i = data.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) { 
			e.printStackTrace(); 
		} catch (IOException e) { 
			e.printStackTrace(); 
		}
	}
}
