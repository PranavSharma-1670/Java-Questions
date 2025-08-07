package MainCodes;
import utilities.Calculator;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator addition = ( a,b) -> a+b;
		Calculator subtraction = ( a,b) -> a-b;
		Calculator multiplication = ( a,b) -> a*b;
		
		int val1 = addition.compute(27, 9);
		int val2 = subtraction.compute(27, 9);
		int val3 = multiplication.compute(27, 9);
		
		System.out.println(" Addition is : " + val1); 
		System.out.println(" Subtraction is : " + val2); 
		System.out.println(" Multiplication is : " + val3);
	}
}
