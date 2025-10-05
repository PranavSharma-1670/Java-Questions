//1.	Find the Maximum Product Subarray: Given an integer array nums, 
//find the contiguous subarray (containing at least one number) with the largest product.
//Example:
//a.	Input: nums = [2,3,-2,4]
//b.	Output: 6 (subarray [2,3])

package Set2;

public class Ques1 {
	public static String MaximumProductSubarray (int[] arr){
		
		if (arr == null || arr.length == 0) return ("Array is Empty");
		
		int maxset = 0;
		int value = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			value = arr[i]*arr[i+1];
			if (maxset < value) maxset=value; 
			
		}
		return ("" + maxset);
		
	}
	public static void main(String[] args) {
//		int[] nums = {2,3,-2,4};
		int[] nums = {2,3,4,6,-2,5};
		System.out.println(MaximumProductSubarray(nums));
	}
}
