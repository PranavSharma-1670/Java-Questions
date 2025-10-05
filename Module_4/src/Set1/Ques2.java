//2.	Write a generic method swapElements that swaps two elements in an array.
//Demonstrate its usage with different data types. 
package Set1;

class GenericMethod{
	
	public <T> void swapElements(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}


public class Ques2 {
	public static void main(String[] args) {
		String[] names = {"Pranav", "Paridhi", "Suraj", "Raghav"};
     Integer[] numbers = {3, 9, 7, 27};
     
     GenericMethod Gmet = new GenericMethod();
     
     System.out.println("Before swap: " + java.util.Arrays.toString(names));
     Gmet.swapElements(names, 1, 2);
     System.out.println("After swap: " + java.util.Arrays.toString(names));
     
     System.out.println("Before swap: " + java.util.Arrays.toString(numbers));
     Gmet.swapElements(numbers, 1, 2);
     System.out.println("After swap: " + java.util.Arrays.toString(numbers));
	}
}
