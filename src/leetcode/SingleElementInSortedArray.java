/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class SingleElementInSortedArray {

	/*
	 * @link https://leetcode.com/problems/single-element-in-a-sorted-array/description/
	 * 
	 * */
	public static void main(String[] args) {
		int[] data = new int[]{1,1,2};
		int nonDuplicate = singleNonDuplicate(data);
		System.out.println(nonDuplicate);
		

	}
	
	public static int singleNonDuplicate(int[] nums) {
		
		int currentIndex = 0;
		int result = 0;
		int defaultCount = 1;
		
		while(currentIndex < nums.length -1) {
			if(nums[currentIndex] == nums[currentIndex + 1]) {
				defaultCount += 1;
			}
			if(defaultCount == 1) {
				result = nums[currentIndex];
				break;
			}else {
				currentIndex += 2;
				result = nums[currentIndex];
				defaultCount = 1;
			}
			
		}
		return result;
	}

}
