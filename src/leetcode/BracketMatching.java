/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class BracketMatching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = ")(";
		int count = bracketMatch(text);
		System.out.println("Count  " + count);
	}
	
	static int bracketMatch(String text) {
		int open_brackets_count = 0;
		int close_brackets_count = 0;
		
		for(char c : text.toCharArray()){
			if(c == '(') {
				open_brackets_count++;
			}else if(c == ')') {
				if(open_brackets_count == 0) {
					// no previous open bracket encountered.
					close_brackets_count++;
				}else {
					// a previous open bracket is already encountered
					open_brackets_count--;
				}
			}	
		}
		
		return open_brackets_count + close_brackets_count;
	}

}
