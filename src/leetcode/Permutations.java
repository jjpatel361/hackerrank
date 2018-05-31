package leetcode;

import java.util.Arrays;

public class Permutations {

	public static void main(String[] args) {

		permute(new int[]{1, 2, 3, 4, 5});
	}

	public static void permute(int[] nums) {
		permuteHelper(nums, 0);
		return;
	}

	
	
	public static void permuteHelper(int[] nums, int fixedpoint) {
		System.out.println("***********");
		System.out.println("FP:" + fixedpoint);
		
		if(fixedpoint == nums.length-1) {
			System.out.println("Nums " + Arrays.toString(nums));
			return;
		}
		
		
		for (int i = fixedpoint; i < nums.length; i++) {
			swap(nums, fixedpoint, i);
			permuteHelper(nums, fixedpoint+1);
			swap(nums, i, fixedpoint);
		}
		
	}
	
	public static void swap(int[] nums, int source, int target) {
		int temp = nums[source];
		nums[source] = nums[target];
		nums[target] = temp;
	}
}
