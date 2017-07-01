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
	 */
	public static void main(String[] args) {
		
		int[]  data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] transposed_data = new int[data.length];
		int rows = 3;
		int cols = 3;
		int index = 0;
		for (int x = 0; x < rows ; x++) {
			
			for (int y = 0; y < cols; y++) {
				//System.out.println("X: " + x + " Y: " + y);
				int new_index = (3*y + x);
				System.out.println("X: " + x + " Y: " + y + " Original Index " + index + " New Index " + (3*y + x));
				transposed_data[new_index] = data[index];
				index ++ ;
			}
			if(index== data.length/2){
				System.out.println("Exiting at half");
				break;
			}
			
		}
		
		System.out.println(transposed_data);
		
		
		
	}

}
