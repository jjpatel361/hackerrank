package leetcode;


import java.util.Arrays;

public class TwoSum {

	/*
	 * @description https://leetcode.com/problems/two-sum/description/ 
	 * 
	 * */
	public static void main(String[] args) {
		
		int [] p = new int[]{-1,-2,-3,-4,-5}; // - 8  // [2, 4] 
		
		int target = -8;
		
		int[] result = twoSum(p, target);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
		
		int[] sorted_arr = nums.clone();
		int[] result = new int[2];
		
		Arrays.sort(sorted_arr);
		
		for (int i = 0; i < sorted_arr.length - 1; i++) {
			
			int first_number = sorted_arr[i];
			int second_number = target - first_number;
			int[] search_window = Arrays.copyOfRange(sorted_arr, i + 1, sorted_arr.length);
			int index = Arrays.binarySearch(search_window, second_number);
			if(index >= 0) {
				// look up values 
				for (int j = 0; j < nums.length; j++) {
					if(nums[j] == first_number) {
						result[0] = j;
						break;
					}
				}
				
				// look up for second index
				for (int j = 0; j < nums.length; j++) {
					if(nums[j] == second_number && j != result[0]) {
						result[1] = j;
						break;
					}
				} 
				 break;
			}
			
			
		}
		return result;
	}

}
