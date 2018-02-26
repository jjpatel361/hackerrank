package leetcode;

import java.util.Stack;

public class NumberPattern {

	public static class Pair {

		int min;
		int max;

		public Pair(int min_encountered, int max_encountered) {
			this.min = min_encountered;
			this.max = max_encountered;
		}
	}

	public static boolean find132pattern(int[] nums) {

		Stack<Integer> stack = new Stack<Integer>();
		
		int min = Integer.MAX_VALUE;
		for (int i : nums) {
			if(i < min) {
				min = i;
			} else {
				while(!stack.isEmpty() && stack.peek() < i) {
					stack.pop(); // popped max out now stack is pointing to min
					if(stack.pop() > i) {
						return true;
					} // pattern detected 
					// if not detected then pair is discarded
				}
				
				stack.push(i);
				stack.push(min);
			}
			
		}		
		return false;
	}

}
