/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class JewelsAndStones {

	public static int numJewelsInStones(String J, String S) {
		if (S == null || "".equalsIgnoreCase(S)) return 0;
		int count = 0;
		for (char c : S.toCharArray()) {
			if(J.indexOf(c) > -1) count++;
		}
		return count;
	}

}
