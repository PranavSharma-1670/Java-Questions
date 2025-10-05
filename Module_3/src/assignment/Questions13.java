// 13.	Reading File Using Byte Stream: 
//	Write a program that reads a text file 
//	using the FileInputStream and prints the 
//	contents to the console.
package assignment;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Questions13 {
	public static void main(String[] args) {
		String file = "src/files/input.txt";
        try (FileInputStream fis = new FileInputStream(file)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) { 
			e.printStackTrace(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
