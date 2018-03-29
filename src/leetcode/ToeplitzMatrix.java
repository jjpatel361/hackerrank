/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class ToeplitzMatrix {

	public static boolean isToeplitzMatrix(int[][] matrix) {
		
		int max_iter = matrix.length - 1; 
		int sliding_size = matrix[0].length - 1; 
		int row_ptr = 0;
		int col_ptr = 0;
		
		while (row_ptr < max_iter) {
			col_ptr = 0;
			while(col_ptr < sliding_size) {
				
				if(matrix[row_ptr][col_ptr] != matrix[row_ptr+1][col_ptr+1]) {
					return  false;
				}
				col_ptr++;
			}
			
			row_ptr++;
		}
		return true;
	}
}
