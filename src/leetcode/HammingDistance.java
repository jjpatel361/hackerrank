/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class HammingDistance {


	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
	}

	public static int hammingDistance(int x, int y) {
		
		int dist = 0;
		
		int c = x ^ y;
		
		String bin_str = Integer.toBinaryString(c);
		for(char digit : bin_str.toCharArray()) {
			if(digit == '1') dist++;
		}
		
		return dist;
	}

}
