/**
 * 
 */
package leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author Jay Patel
 *
 */
public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(wordBreak("a", new ArrayList<String>()));

	}

	static boolean wordBreak(String s, List<String> dict) {
		
		boolean[] f = new boolean[s.length() + 1];
		
		f[0] = true; // s.substring(0,0) => "" which is always true
		
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if(f[j] && dict.contains(s.substring(j, i))){
					f[i] = true;
					break;
				}
			}
		}
		
		return f[s.length()];
	}
	
//	public static boolean wordBreak(String s, List<String> wordDict) {
//		
//		int n = s.length();
//		
//		if(wordDict.size() == 0) return false;
//		
//		HashMap<Integer, List<Integer>> foundItems = new HashMap<Integer, List<Integer>>();
//		
//		// diagonal items 
//		for (int i = 0; i < n; i++) {
//			
//			List<Integer> candidates = new java.util.ArrayList<>();
//			
//			if(wordDict.contains(s.substring(i, i+1))) {
//				candidates.add(i);
//			}
//			
//			foundItems.put(i, candidates);
//		}
//		
//		// upper matrix traversal
//		
//		for (int i = 0; i < n; i++) {
//			
//			for (int j = i+1; j < n; j++) {
//				
//				String tmp = s.substring(i,j+1);
//				if(wordDict.contains(tmp)) {
////					System.out.println("word found : " + tmp);
//					foundItems.get(j).add(i);
//				
//				}
//			}
//		}
//		
////		for(Entry<Integer, List<Integer>> c : foundItems.entrySet()){
////			int k = c.getKey();
////			String val = "";
////			for (Integer bs : c.getValue()) {
////				val += "," + bs;
////			}
////			System.out.println("K: " + k + " V :" + val);
////		}
//		
//		int startPoint = s.length() -1; // lower end of the matrix
//		
//		boolean result = dfs(foundItems, startPoint); 
//		
//		
//		return result;
//	}
//
//	private static boolean dfs(HashMap<Integer, List<Integer>> foundItems, 
//			int startPoint) {
//		
////		System.out.println("===================");
////		System.out.println("Exploring current candidate " + startPoint);
//		
//		
//		List<Integer> candidates = foundItems.get(startPoint);
//		
//		if(candidates.isEmpty()) {
////			System.out.println("No candidates found");
//			return false;
//		}
//		
//		// if current candidate is 0 end is reached
//		if (startPoint == 0) return true;
//				
//		
//		for (Integer candidate : candidates) {
////			System.out.println("Selected Candidate :"  + candidate);
//			// base case
//			if(candidate == 0) {
//				return true;
//			}
//			
//			if(dfs(foundItems, candidate - 1)){
////				System.out.println("Solution Found stopping exploration " + candidate);
//				return true; // don't explore other candidates if 
//				// solution is found
//			}
//			
//		}
//		
////		System.out.println("===================");
//		return false;
//	}

}
