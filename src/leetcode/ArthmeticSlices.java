/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class ArthmeticSlices {

	public static int numberOfArithmeticSlices(int[] A) {
		
		int[] explored = new int[A.length];
		int sum = 0;
		for (int i = 2; i < A.length; i++) {
			if(A[i] - A[i-1] == A[i - 1] - A[i - 2]) {
				explored[i] = explored[i-1] + 1;
				sum += explored[i];
			}
		}
		
		return sum;
	}

}
