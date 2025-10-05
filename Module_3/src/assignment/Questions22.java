// 22.	Random Access File: 
//	Create a program that uses the RandomAccessFile 
//	class to read and write to specific positions 
//	within a file. The program should write some data 
//	at the beginning of the file, then overwrite part 
//	of it later.
package assignment;
import java.io.RandomAccessFile;
import java.io.IOException;

public class Questions22 {
	public static void main(String[] args) {
		String file = "src/files/random.txt";
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            
            // Write data at the beginning
            raf.writeUTF("Hello, Java!");
            
            // Move pointer to start and read
            raf.seek(0);
            System.out.println("Initial Content: " + raf.readUTF());

            // Overwrite part of it
            raf.seek(6); 
            raf.writeUTF("Random Access");

            // Reset and read again
            raf.seek(0);
            System.out.println("Updated Content: " + raf.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
