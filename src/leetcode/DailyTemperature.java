/**
 * 
 */
package leetcode;

import java.util.Stack;

/**
 * @author Jay Patel
 *
 */
public class DailyTemperature {

	public static int[] dailyTemperatures(int[] temperatures) {
		
		int[] result = new int[temperatures.length];
		Stack<Integer> indexStack = new Stack<Integer>();
		
		for (int i = 0; i < temperatures.length; i++) {
			
			if(indexStack.isEmpty()) {
				 indexStack.push(i);
				 continue;
			}
			
			while( !indexStack.isEmpty() && temperatures[i] > temperatures[indexStack.peek()]) {
				result[indexStack.peek()] = i - indexStack.peek();
				indexStack.pop();
			}
			
			indexStack.push(i);
		}
		
		return result;
	}
}
