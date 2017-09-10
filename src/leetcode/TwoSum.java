package leetcode;

import java.util.Arrays;

public class TwoSum {

	/*
	 * @description https://leetcode.com/problems/two-sum/description/ 
	 * 
	 * */
	public static void main(String[] args) {
		//int[] p = new int[] {2, 7, 11, 15}; // 9
		//int[] p = new int[] {3,2,4}; // 6
		//int[] p = new int[]{3,3}; // 6
	    //int [] p = new int[]{-3,4,3,90}; // 0
		
		int [] p = new int[]{-1,-2,-3,-4,-5}; // - 8 
		
		int target = -8;
		
		int[] result = twoSum(p, target);
		for (int i : result) {
			System.out.print(i);
		}
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
		
		int[] sorted_data = nums.clone();
		
		Arrays.sort(sorted_data);
		
		// search index where 
		// value exceeds/equal target
		int index = 0;
		
		for (int i = 0; i < sorted_data.length; i++) {
			index = i;
		
			if(sorted_data[i] > target) {
				break;
			}
		}
		
		int i = 0; // starting point
		int j = index; // j points to index till we want the searching to happen
		int[] result_index = new int[2];
		int found = 0;
		
		while(i < j) {
			
			int smaller_number = sorted_data[i];
			int larger_number = sorted_data[j];
			int sum = smaller_number + larger_number;
			
			if(sum == target) {
				// search for smaller number
				for (int k = 0; k < nums.length; k++) {
					if(smaller_number == nums[k]) {
						result_index[0] = k;
						found++;
						break;
					}
				}
				
				for (int k = 0; k < nums.length; k++) {
					if(larger_number == nums[k] && k!= result_index[0]) {
						result_index[1] = k;
						found++; // remove found not used
						break;
					}
				}
				
				break; 
				
			}
			
			if(sum > target) {
				j--;
			}
			
			if(sum < target) {
				i++;
			}
			
		}
		return result_index;
    }

}
