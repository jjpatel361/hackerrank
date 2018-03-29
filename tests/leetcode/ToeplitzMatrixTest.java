package leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ToeplitzMatrixTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsToeplitzMatrix_1() {
		
		int[] row1 = new int[]{1, 2, 3, 4};
		int[] row2 = new int[]{5, 1, 2, 3};
		int[] row3 = new int[]{9, 5, 1, 2};
		
		int[][] matrix = new int[3][4];
		
		matrix[0] = row1;
		matrix[1] = row2;
		matrix[2] = row3;
		
		boolean res = ToeplitzMatrix.isToeplitzMatrix(matrix);
		assertTrue(res);
	}
	
	@Test
	public void testIsToeplitzMatrix_2() {
		
		int[] row1 = new int[]{1, 2};
		int[] row2 = new int[]{3, 1};
		
		int[][] matrix = new int[2][2];
		
		matrix[0] = row1;
		matrix[1] = row2;
		
		boolean res = ToeplitzMatrix.isToeplitzMatrix(matrix);
		assertTrue(res);
	}
	
	
	@Test
	public void testIsToeplitzMatrix_3() {
		
		int[] row1 = new int[]{1, 2};
		int[] row2 = new int[]{1, 2};
		
		int[][] matrix = new int[2][2];
		
		matrix[0] = row1;
		matrix[1] = row2;
		
		boolean res = ToeplitzMatrix.isToeplitzMatrix(matrix);
		assertFalse(res);
	}

}
