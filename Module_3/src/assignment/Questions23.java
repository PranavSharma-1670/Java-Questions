// 23.	Using java.lang Package: 
//	Write a program that demonstrates 
//	the use of Math.random(), Math.abs(),
//	and Math.pow() from the java.lang package.
package assignment;

public class Questions23 {
	public static void main(String[] args) {
        double randomNum = Math.random();  // between 0.0 ≤ num < 1.0
        int absolute = Math.abs(-25);
        double power = Math.pow(2, 5);     // 2^5 = 32

        System.out.println("Random Number: " + randomNum);
        System.out.println("Absolute Value: " + absolute);
        System.out.println("Power (2^5): " + power);
    }
}
