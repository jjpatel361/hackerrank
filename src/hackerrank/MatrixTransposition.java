/**
 * 
 */
package hackerrank;

/**
 * @author Jay Patel
 *
 */
public class MatrixTransposition {

	/**
	 * @param args
	 * 
	 * Transpose the matrix without using 2D array.
	 * 
	 */
	public static void main(String[] args) {
		
		int[]  data = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		//int[]  data = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
		int[] transposed_data = new int[data.length];
		int rows = (int) Math.sqrt(data.length);
		int cols = rows;
		double jump = Math.sqrt(data.length);
		if(jump != Math.floor(jump)){
			throw new IllegalArgumentException("Invalid argument. Matrix should be sqaure.");
		}
		int index = 0;
		for (int x = 0; x < rows ; x++) {
			
			for (int y = 0; y < cols; y++) {
				
				int new_index = (((int)jump)*y + x);
				//System.out.println("X: " + x + " Y: " + y + " Original Index " + index + " New Index " + (((int)jump)*y + x));
				transposed_data[new_index] = data[index];
				transposed_data[index] = data[new_index];
				index ++ ;
			}
		}
			
		System.out.println("Original Array " );
		prettyPrint(data);
		System.out.println("Transposed Array " );
		prettyPrint(transposed_data);
		
	}

	private static void prettyPrint(int[] transposed_data) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < transposed_data.length; i++) {
			sb.append(" " + transposed_data[i]);
		}
		System.out.println(sb.toString());
	}

}
