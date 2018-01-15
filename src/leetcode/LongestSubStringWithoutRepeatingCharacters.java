/**
 * 
 */
package leetcode;

import java.util.HashMap;

/**
 * @author Jay Patel
 *
 */
public class LongestSubStringWithoutRepeatingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
//		System.out.println(lengthOfLongestSubstring("bbbb"));

	}

	public static int lengthOfLongestSubstring(String str) {
		
		if(str == null || str.length() == 0 || "".equalsIgnoreCase(str)) return 0;

		if(str.length() == 1) return 1;
		
		HashMap<Character, Integer> index_count = new HashMap<Character, Integer>(str.length());
		int pointer = 0;
		int start = 0;
		int max_length = 0;
		while(pointer < str.length()) {
			char current_char = str.charAt(pointer);
			if(index_count.containsKey(current_char) && index_count.get(current_char) >= start) {
				start = index_count.get(current_char) + 1;
			}
			index_count.put(current_char, pointer);
			max_length = Math.max(max_length, pointer - start + 1);
			pointer++;
		}
		return max_length;
		
	}

}
