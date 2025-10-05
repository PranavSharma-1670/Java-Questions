// 17.	Buffered I/O: 
//	Modify the previous FileReader and FileWriter 
//	examples to use BufferedReader and BufferedWriter 
//	respectively to read from and write to the file, 
//	improving performance.
package assignment;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Questions17_Writer {
	public static void main(String[] args) {
		String file = "src/files/BufferOutput.txt";
        String text = "Hello World, I am Veronica";
        String Outputtext = "Data written to BufferOutput.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(text);
            System.out.println(Outputtext);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
