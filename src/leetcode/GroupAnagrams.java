/**
 * 
 */
package leetcode;

import java.util.*;

/**
 * @author Jay Patel
 *
 */
public class GroupAnagrams {
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		HashMap<String, List<String>> anagram_wordlist = new HashMap<String, List<String>>(strs.length);
		for (String word : strs) {
			
			char[] c = word.toCharArray();
			Arrays.sort(c);
			String sorted_string = new String(c);
			if(anagram_wordlist.containsKey(sorted_string)) {
				anagram_wordlist.get(sorted_string).add(word);
			}else {
				List<String> newWordList = new ArrayList<String>();
				newWordList.add(word);
				anagram_wordlist.put(sorted_string, newWordList);
			}
		}
				
		List<List<String>> result = new ArrayList<List<String>>();
		result.addAll(anagram_wordlist.values());
		
		return result;
	}

}
