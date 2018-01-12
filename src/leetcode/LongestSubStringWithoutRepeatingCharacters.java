/**
 * 
 */
package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jay Patel
 *
 */
public class LongestSubStringWithoutRepeatingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println(lengthOfLongestSubstring("pwwkew"));
//		System.out.println(lengthOfLongestSubstring("bbbb"));
	}

	public static int lengthOfLongestSubstring(String s) {
		
		if(s == null || "".equalsIgnoreCase(s)) return 0;
		
		if(s.length() == 1) return 1;
		
		// pointers 
		int current_start_ptr = 0, max_length = 0;
		
		while(current_start_ptr < s.length()) {
			int index_ptr = current_start_ptr;
			
			Set<Character> explored = new HashSet<Character>();
			
			while(index_ptr < s.length()) {
				if(!explored.contains(s.charAt(index_ptr))) {
					// add to the set
					explored.add(s.charAt(index_ptr));
				}else {
					break;
				}
				// max reached 
				max_length = max_length < explored.size() ? explored.size() : max_length;
				index_ptr++;
			}
			current_start_ptr++;
		}
		return max_length;
	}

}
