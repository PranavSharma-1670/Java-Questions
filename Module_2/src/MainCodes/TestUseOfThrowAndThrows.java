package MainCodes;
import exception.NegativeNumberException;

public class TestUseOfThrowAndThrows {
	// Method that uses `throws` but handles internally (no actual throw)
	static int factorial_throws(int n){
		if (n < 0) {
			System.out.println("Negative number not allowed");
			System.err.println("Negative number not allowed");
			return -1;
		}
		if (n == 0) return 1;
		return n * factorial_throws(n - 1);
	}
	
	// Method that uses `throw` to explicitly throw exception
	static int factorial_throw(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Negative number not allowed");
        }
        if (n == 0) return 1;
        return n * factorial_throw(n - 1);
    }

    public static void main(String[] args) {
        try {
        	// Display with the sentence 
        	System.out.println("Factorial with Throws : " + factorial_throws(-5));
        	// Does not Display with the sentence 
        	System.out.println("Factorial with Throw : " + factorial_throw(-5));
        } catch (NegativeNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
