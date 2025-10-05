// 20.	Copying a File: 
//	Create a program that copies the contents 
//	of one file to another using byte streams 
//	(FileInputStream and FileOutputStream).
package assignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Questions20 {
	public static void main(String[] args) {
		String Ifile = "src/files/TestInout.txt";
	    String Ofile = "src/files/TestCopy.txt";
	    try (FileInputStream fis = new FileInputStream(Ifile);
	    	FileOutputStream fos = new FileOutputStream(Ofile)) {
	    	int data;
	    	while ((data = fis.read()) != -1) {
	    		fos.write(data);
	    	}
	    	System.out.println("File copied successfully!");
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	}

}
