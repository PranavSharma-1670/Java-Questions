package MainCodes;

public class TestTryCatch {
	public static void main(String[] args) {
        int a = 10, b = 0;

        // try-catch
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception in try-catch: " + e);
        }

        // try-catch-finally
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception in try-catch-finally: " + e);
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
