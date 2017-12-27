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
		int[] data = new int[]{1,1,2,2,3,3,4,4,5,5,6};
		int nonDuplicate = singleNonDuplicate(data);
		System.out.println(nonDuplicate);
		

	}
	
	public static int singleNonDuplicate(int[] nums) {
		int start = 0;
		int end = nums.length-1;
		
		while(start < end) {
			// calculate mid 
			int mid = (start + end )/2;
			
			if(mid % 2 == 1) mid--;
			
			if(nums[mid] != nums[mid+1]) {
				end = mid;
			} else {
				start = mid + 2; 
			}
			
		}
			
		return nums[start];
		
		/*		
		for (int i = 0; i < nums.length; i+=2) {
			if(nums.length == i+1 || nums[i] != nums[i+1]) {
				result = nums[i];
				break;
			}
		}
		return result;*/
	}

}
