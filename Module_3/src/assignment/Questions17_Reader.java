// 17.	Buffered I/O: 
//	Modify the previous FileReader and FileWriter 
//	examples to use BufferedReader and BufferedWriter 
//	respectively to read from and write to the file, 
//	improving performance.
package assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questions17_Reader {
	public static void main(String[] args) {
		String file = "src/files/BufferInput.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
