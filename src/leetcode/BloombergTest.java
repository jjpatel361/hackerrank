/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author Jay Patel
 *
 */
public class BloombergTest {

	// non static 
	// BloombergTest t = new BloombergTest();
	// t.customLexicalSort();
	// static 
	// BloombergTest.customLexicalSort();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String target = "Hello World";
		String lexicalOrder = "leoWdHr";
		String result = customLexicalSort(target, lexicalOrder);
		System.out.println(result);
	}
	
	public static String customLexicalSort(String target, String lexicalOrder){
		
		HashMap<Character, Integer> ranking = new HashMap<Character, Integer>(lexicalOrder.length());
		HashMap<Integer, Character> reverseRanking = new HashMap<Integer, Character>(target.length());
		
		int count = 1;
		
		for(char c : lexicalOrder.toCharArray()) {
			if(!ranking.containsKey(c)) {
				ranking.put(c, count);
				reverseRanking.put(count, c);
				count++;
			}
		}
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for(char c: target.toCharArray()){
			if(ranking.containsKey(c)) {
				q.add(ranking.get(c));
			}
		}
		String result = "";
		while(!q.isEmpty()) {
			result += reverseRanking.get(q.poll());
		}
		
		System.out.println(result);
		
		return "";
	}

}
