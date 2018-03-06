package leetcode;

public class JumpGame {

	public static void main(String[] args) {

		int[] nums = new int[]{2,3,1,1,4};
		boolean result = canJump(nums);
		System.out.println("Completed " + result);
		
	}

	public static boolean canJump(int[] nums) {
		
		int max_index_reachable = 0;
		int index = 0;
		while(max_index_reachable < nums.length - 1) {
			
			if(index > max_index_reachable) {
				break;	
			}
			
			max_index_reachable = Math.max(max_index_reachable, nums[index] + index);
			index++;
		}
		
		return max_index_reachable >= nums.length - 1;
	}

}
