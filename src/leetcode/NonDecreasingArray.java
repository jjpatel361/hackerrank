/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class NonDecreasingArray {

	public static void main(String[] args) {
		int[] test = new int[]{4, 2, 3};
//		int[] test = new int[]{3, 4, 2, 3};
		System.out.println(checkPossibility(test));
	}
	
	
	public static boolean checkPossibility(int[] nums) {
		
		int highest_val_ptr = 1;
		int count_dips = 0;
		
		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i] >= nums[highest_val_ptr]) {
				highest_val_ptr = i;
			}else {
				count_dips++;
				if(count_dips > 1) break;
			}			
		}
		
		if(count_dips == 0) return true;
		
		if(count_dips == 1 && nums[0] < nums[1]) return true;
		
		return false;
	}

}
