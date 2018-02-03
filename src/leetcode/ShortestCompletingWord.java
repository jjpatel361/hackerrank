/**
 * 
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Jay Patel
 *
 */
public class ShortestCompletingWord {

	
	public static void main(String[] args) {
		String licensePlate = "1s3 PSt";
		licensePlate = licensePlate.replace(" ", "").replaceAll("[0-9]", "").toLowerCase().trim();
		char[] c = licensePlate.toCharArray();
		Arrays.sort(c);
		
		System.out.println(new String(c));
	}
	
	public static String shortestCompletingWord(String licensePlate, String[] words) {
		
		// normalize license plate 
		licensePlate = licensePlate.replace(" ", "").replaceAll("[0-9]", "").toLowerCase().trim();
		char[] c = licensePlate.toCharArray();
		
		// Define keyword Hash Map
		HashMap<Character, Integer> keyword_mapping = new HashMap<Character, Integer>(c.length);
		
		// Populate hash map
		for(char t : c){
			if(keyword_mapping.containsKey(t)){
				int current_count = keyword_mapping.get(t);
				keyword_mapping.put(t, current_count +1);				
			}else {
				keyword_mapping.put(t, 1);
			}
		}
		
		String min_word = null;
		int min_word_length = Integer.MAX_VALUE;
		
		int max_match_count = 0;
			
		for(String word : words) {
			// create HashMap
			HashMap<Character, Integer> dict_word_mapping = new HashMap<Character, Integer>();
			
			//populate char array
			for(char t: word.toCharArray()){
				if(dict_word_mapping.containsKey(t)){
					int count = dict_word_mapping.get(t);
					dict_word_mapping.put(t, count+1);
				}else {
					dict_word_mapping.put(t, 1);
				}
			}
			
			int match_count = 0;
			boolean isMatched = true;
			// Compare both hash map
			for(char t : keyword_mapping.keySet()) {
				if(dict_word_mapping.containsKey(t)) {
					 int ct = dict_word_mapping.get(t);
					 if(ct < keyword_mapping.get(t)) {
						 isMatched = false;
						 break;
					 }else {
						 match_count += keyword_mapping.get(t);
					 }
				}	
			}
			
//			System.out.println("Match Count : " + match_count + " match word " + word);
			
			if(isMatched && (max_match_count < match_count  
					||	max_match_count == match_count && word.length() < min_word_length
					)) {
				max_match_count = match_count;
				min_word = word;
				min_word_length = word.length();
//				System.out.println("Found best solution : " + word);
			}
			
		}
		
		
		return min_word;
	}
}
