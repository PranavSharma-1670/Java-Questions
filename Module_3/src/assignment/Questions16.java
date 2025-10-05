// 16.	Writing to a File Using Character Stream: 
//	Write a program that writes a string to a 
//	file using the FileWriter class. The string 
//	should be written to a file named example.txt.
package assignment;
import java.io.FileWriter;
import java.io.IOException;

public class Questions16 {
    public static void main(String[] args) {
    	String file = "src/files/example.txt";
        String text = "Writing with FileWriter Example";
        String Outtext = "Data written to example.txt";
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(text);
            System.out.println(Outtext);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
