/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jay Patel
 *
 */
public class SubSets {

	/**
	 * @param args
	 */
	 
	public static List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	public static void main(String[] args) {
		
		int[] nums = new int[]{1, 2, 3, 4};
		res = new ArrayList<List<Integer>>(); 	
		backtrack(new ArrayList<Integer>(), nums, 0);
		
	}

	public static void backtrack(
		List<Integer> chosen, 
		int[] nums, 
		int start
	) {
		
		System.out.println(chosen.toString());
		
		res.add(new ArrayList<Integer>(chosen));
		
		for(int i = start; i < nums.length; i++){
			
			// choose
			chosen.add(nums[i]);
			
			// track
			backtrack(chosen, nums, i +1);
			
			// backtrack/ unchoose
			chosen.remove(chosen.size() -1);
		}
		
		
	}
	
	
}
