/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class Sqrt {
	
	public static void main(String[] args) {
		int x = 16;
		int y = mySqrt(x);
		System.out.println(y);
	}
	
	public static int mySqrt(int x) {
		long r = x;
		while (r*r > x) {
	    	r = (r + x/r) / 2;
	    }
	    return (int) r;
    }

}
