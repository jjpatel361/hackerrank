/**
 * 
 */
package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Jay Patel
 * {@link} https://leetcode.com/problems/3sum/description/
 *
 */
public class ThreeSum {

	/**
	 * a + b + c = 0 find all sets
	 * For example, given array S = [-1, 0, 1, 2, -1, -4],
		A solution set is:
		[
		  [-1, 0, 1],
		  [-1, -1, 2]
		]
	 */
	public static void main(String[] arg) {
		
		// {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0}
		// {0,0,0}
		// {0}
		// {1,2,-2,-1}
		// {-1, 0, 1, 2, -1, -4}
		// {-1,0,1,2,-1,-4}
		int[] p = new int[] {-1,0,1,2,-1,-4}; 
		List<List<Integer>> o = threeSum(p);
		for (List<Integer> list : o) {
			System.out.println(list);
		}
	}
	
	/**
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> threeSum(int[] nums) {
		
		
		List<List<Integer>>  solutionSet =  new ArrayList<List<Integer>>();
		Set<List<Integer>> solution_hashset = new HashSet<List<Integer>>();
		
		Arrays.sort(nums);
		
		int current_sum = 0;
		for (int i = 0; i < nums.length -1; i++) {
			
			int k = nums.length - 1;
			
			for (int j = i+1; j < k; ) {
				
				current_sum = nums[i] + nums[j] + nums[k]; 
				if( current_sum == 0) {
					// solution found
					int[] current_solution = new int[]{nums[i], nums[j], nums[k]};
					
					Arrays.sort(current_solution);
					List<Integer> sol_d = Arrays.stream(current_solution).boxed().sorted().collect(Collectors.toList());
					solution_hashset.add(sol_d);
					
					j++;
					k--;
					while(j <k && nums[j] == nums[j-1]) j++;
					while(j <k && nums[k] == nums[k+1]) k--;
					
					
				}else if(current_sum < 0) {
					// need more positive
					j++;
				}else if(current_sum > 0) {
					// need less positive 
					k--;
				}
			}
			
			while(i < nums.length -1 && nums[i] == nums[i+1]) i++;
			
		}
		
		
		for (List<Integer> list : solution_hashset) {
			solutionSet.add(list);	
		}
		return solutionSet;
		
	}

}
