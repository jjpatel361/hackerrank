/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author Jay Patel
 *
 */
public class RelativeRanks {
	
	public static void main(String[] args) {
		int[] new_test = new int[]{10, 3, 8, 9, 4};
		String[] result = findRelativeRanks(new_test);
		System.out.println(Arrays.toString(result));
	}
	
	
	public static String[] findRelativeRanks(int[] nums) {
		
String[] result = new String[nums.length];
		
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
		HashMap<Integer, String> initial_ranking = new HashMap<Integer, String>();
		initial_ranking.put(0, "Gold Medal");
		initial_ranking.put(1, "Silver Medal");
		initial_ranking.put(2, "Bronze Medal");
		
		// populate the priority queue
		for(int n : nums) {
			q.add(n);
		}
		
		// pop from queue
		int ct = 0;
		HashMap<String, String> rankings = new HashMap<String, String>();
		while(!q.isEmpty()) {
			if(initial_ranking.containsKey(ct)) {
				//result[ct] = initial_ranking.get(ct);
				rankings.put(q.poll()+"", initial_ranking.get(ct));
			}else {
				//result[ct] = (ct +1) + "";
				rankings.put(q.poll() + "", ct+1+"");
			}
			ct++;
		}
		
		for (int i = 0; i < nums.length; i++) {
			result[i] = rankings.get(nums[i]+ "");
		}
		
		return result;
	}
}
