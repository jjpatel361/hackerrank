/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author Jay Patel
 * @link https://leetcode.com/problems/valid-parentheses/description/ 
 * 
 */
public class ValidParentheses {

	public static boolean isValid(String s) {
		
if (s.length() %2 != 0) return false; // the length has to be even
		
		Stack<Character> stack = new Stack<Character>();
		
		char[] symbols = s.toCharArray();
		
		if('}' == symbols[0] || ']' == symbols[0] || ')' == symbols[0]) { return false;} // string cannot start with reverse brackets
		
		for (char bracket : symbols) {
			if('{' == bracket || '[' == bracket || '(' == bracket) {
				stack.push(bracket);
			}else {
				char lastInSymbol = stack.peek();
				if(bracket == '}' && lastInSymbol != '{' || bracket == ']' && lastInSymbol != '[' || bracket == ')' && lastInSymbol != '(') {
					break;
				}else {
					stack.pop();
				}
			}
		}
		
		return stack.isEmpty();
	}

}
