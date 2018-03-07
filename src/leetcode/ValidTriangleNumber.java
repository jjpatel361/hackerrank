/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author Jay Patel
 *
 */
public class ValidTriangleNumber {


	public static int triangleNumber(int[] nums) {
		
		int count = 0;
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				
				int max_possible_side = nums[i] + nums[j];
				int k = j + 1;
				while(k < nums.length && nums[k] < max_possible_side){
					count++; k++;
				}
			}
		}
		return count;
    }
}
