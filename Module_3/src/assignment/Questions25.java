// 25.	Regular Expressions in java.util.regex: 
//	Create a program that uses the Pattern and 
//	Matcher classes from the java.util.regex 
//	package to check if a given string is a 
//	valid email address.
package assignment;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Questions25 {
	public static void main(String[] args) {
        String email = "GodNemesis@Alsafetar.ai";
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " is a valid email.");
        } else {
            System.out.println(email + " is NOT a valid email.");
        }
    }
}
