//5.	Regular Expressions in java.util.regex: Create a program that 
//uses the Pattern and Matcher classes from the java.util.regex package
//to check if a given string is a valid email address.
package lab_set_3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ques5 {
	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter Email to check :");
			String usermail = reader.readLine();
			
			String regex = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]{2,}$";
			
			//Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			//Matcher m = p.matcher(usermail);  
			//boolean result = m.matches();  
			
		boolean result =Pattern.matches(regex, usermail);
			
			System.out.println(result);
			
		} catch (IOException e) {
			System.err.println("Error Occured : " + e);
		}
	}
}
