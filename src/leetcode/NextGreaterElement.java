/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author Jay Patel
 *
 */
public class NextGreaterElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int[] nums1 = new int[]{4,1,2};
		int[] nums2 = new int[]{1,3, 4, 2};
		int[] expected = new int[]{-1,3,-1};
		int[] result = nextGreaterElement(nums1, nums2);
//		Assert.assertArrayEquals(expected, result);
		System.out.println(Arrays.toString(result));*/
		
		int[] nums1 = new int[]{2, 4};
		int[] nums2 = new int[]{1,2,3,4};
		int[] expected = new int[]{3, -1};
		int[] result = nextGreaterElement(nums1, nums2);
		System.out.println(Arrays.toString(result));
		

	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums2.length);
		Stack<Integer> s = new Stack<Integer>();
		
		for(int num : nums2) {
			while(!s.isEmpty() && s.peek() < num) {
				map.put(s.pop(), num);
			}
			s.push(num);
		}
		
		int[] result = new int[nums1.length];
		int ct = 0;
		for(int n : nums1) {
			 result[ct++]= map.getOrDefault(n, -1);
		}
		
		return result;
		
	}

}
