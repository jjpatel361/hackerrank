/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author Jay Patel
 *
 */
public class ArrayRotation {
	
	static int[] nums = null;
	
	public static void main(String[] args) {

		int[] datapoint = new int[]{1,2,3,4};
	}
	

	public static void rotate(int[] input, int k) {
		nums = recurse(input, k);
	}

	private static int[] recurse(int[] input, int k) {
		
		// base case
		if(k == 0) {
			return input;
		}
		
		//save last element
		int last_element = input[input.length - 1];
		int tmp = input[0];
		for (int i = 0; i < input.length - 1; i++) {
			int t1 = input[i + 1]; 
			input[i + 1] = tmp;
			tmp = t1;
		}
		
		input[0] = last_element;
		
		return recurse(input, k-1);
	}
}
