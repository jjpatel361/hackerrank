/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author Jay Patel
 *
 */
public class RemoveDuplicatesFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] p = new int[]{1,1,2,3};
		System.out.println(removeDuplicates(p));
	}

	public static int removeDuplicates(int[] nums) {
		int len = 0;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] > nums[i-1]) {
				nums[len+1] = nums[i];
				len++;
			}
		}
		return len +1;
	}

}
