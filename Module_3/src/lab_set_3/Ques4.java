//4.	Write a program that demonstrates the use of Math.random(), Math.abs(), and Math.pow() from the java.lang package.
package lab_set_3;
import java.util.Scanner;

public class Ques4 {
	public static void main(String[] args) {
		
		boolean run = true;
		String ans;
		
		Scanner input = new Scanner(System.in);
		int dice;	
		double a = -9.6;
		double b = 9.6;
		int num = 5;
		int num2 = 2;
		int num3 = 3;
		
//		Math.random()
		while (run) {
			System.out.print("Do you want to Play the Dice (Yes/No) : ");
			ans = input.nextLine();
			ans = ans.toLowerCase();
			if (ans.equals("yes")) {
				dice = (int)(Math.random() * 6) + 1;
				System.out.println("Roll is : " + dice);
			} else run = false;		  	  
		}
		System.out.println("");
		
//		Math.abs()
		System.out.println("Math Abs of +ve and -ve numbers :- ");
		System.out.println("Abs of -9.6 : " + Math.abs(a));
		System.out.println("Abs of 9.6 : " + Math.abs(b));
		
		System.out.println("");
		
//		Math.pow()		
		System.out.println("Math Pow of 5 :- ");
		System.out.println("Pow of 5^2 : " + Math.pow(num, num2));
		System.out.println("Pow of 5^3 : " + Math.pow(num, num3));
	}
}
