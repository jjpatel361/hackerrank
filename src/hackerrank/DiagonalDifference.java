/**
 * 
 */
package hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Jay Patel
 *
 */
public class DiagonalDifference {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner s = new Scanner(new File("./data/diagonaldiff.txt"));
		int no_of_rows = s.nextInt();
		System.out.println("Rows are " + no_of_rows);
		
		int[][] matrix = new int[no_of_rows][no_of_rows];
		
		for (int i = 0; i < no_of_rows; i++) {
			for (int j = 0; j < no_of_rows; j++) {
				matrix[i][j] = s.nextInt();
			}
		}
		s.close();
		
		int right_diagonal_sum = 0;
		int left_diagonal_sum = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			right_diagonal_sum += matrix[i][i];
			left_diagonal_sum += matrix[i][no_of_rows -1 - i];
		}
		System.out.println(Math.abs(right_diagonal_sum - left_diagonal_sum));

	}

}
