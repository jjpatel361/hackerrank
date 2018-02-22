/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author Jay Patel
 *
 */
public class MergeSortedArray {
	
	public static int[] nums1;

	public static void main(String[] args) {
		
		int[] nums1 = new int[4];
		nums1[0] = 1;
		nums1[1] = 4;
		int[] nums2 = new int[3];
		nums2[0] = 2;
		
		int[] expected = new int[]{1,2,4,0,0};
		MergeSortedArray.merge(nums1, 2, nums2, 1);
		
	}	
	
	

	public static void merge(int[] num1, int m, int[] num2, int n) {
		
		int start_num1_index = m - 1;
		int start_num2_index = n - 1;
		int current_last_index = m + n - 1;
		while(start_num1_index > -1 && start_num2_index > -1) {
			num1[current_last_index--] = num1[start_num1_index] > num2[start_num2_index] ? num1[start_num1_index--] : num2[start_num2_index--];
		}
		while(start_num2_index > -1) num1[current_last_index--] = num2[start_num2_index--];
		
		System.out.println(Arrays.toString(num1));
		
	}
}
