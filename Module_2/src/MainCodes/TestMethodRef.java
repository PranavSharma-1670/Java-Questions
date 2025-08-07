package MainCodes;
import utilities.Square;
import utilities.SquareCal;

public class TestMethodRef {
	public static int sqr(int a) {
		return a*a;
	}
	
	public static void main(String[] args) {
		int num_1 = 5;
        int result_1 = TestMethodRef.sqr(num_1); // Same Class Method calling
		System.out.println("M1 Square of " + num_1 + " is: " + result_1);
		
		Square SQR = TestMethodRef::sqr; // Same Class method reference
		int num_2 = 15;
        int result_2 = SQR.compute(num_2);
        System.out.println("M2 Square of " + num_2 + " is: " + result_2);
        
        Square SQR_2 = SquareCal::Sqr; // Different Class method reference
		int num_3 = 25;
        int result_3 = SQR_2.compute(num_3);
        System.out.println("M3 Square of " + num_3 + " is: " + result_3);
	}
}