/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class MissingNumber {

	/*
	 * 	[1, 2, 3, 4] sum = n(n+ 1) / 2 
	 * 	[0, 1, 2, 3] sum = n(n-1) / 2
	 * 
	 * */
	
	
	public static int missingNumber(int[] nums) {
		
		// find sum
		int array_sum = 0;
		for (int i : nums) {
			array_sum += i;
		}

		// expected sum
		int n = nums.length + 1;
		int expected_sum = (n * (n - 1) ) / 2;

		return expected_sum - array_sum;

	}
}
