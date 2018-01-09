/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author Jay Patel
 *
 */
public class MoveZeroes {

	public static int[] nums;
	
	
	public static void moveZeroes(int[] nums) {
		
		MoveZeroes.nums = nums; 
		
		int startpointer = 0, endpointer = 0;
		
		// go to first zero element
		while(startpointer < nums.length && nums[startpointer] != 0) {
			startpointer++;
		}
		
		endpointer = startpointer;
		
		while(endpointer < nums.length) {
			if(nums[endpointer] != 0) {
				//swap 
				nums[startpointer] = nums[endpointer];
				nums[endpointer] = 0;
				startpointer++;
			}
			endpointer++;
		}
		
		System.out.println(Arrays.toString(nums));
		
	}
	
}
