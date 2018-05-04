/**
 * 
 */
package ctci;

import java.util.Arrays;

/**
 * @author Jay Patel
 *
 */
public class PancakeSorting {

	public static void main(String[] args) {
		
		int[] data = new int[]{12, 67, 55, 34, 24, 36};
		pancakeSort(data);
		System.out.println(Arrays.toString(data));
		
	}
	
	public static int[] pancakeSort(int[] arr) {
		
		int max_idx = -1;
		for(int i = arr.length -1; i > 0; i--) {
			 max_idx = maxIndex(arr, 0, i);
			 flip(arr, max_idx);
			 flip(arr, i );
		}
		return arr;
	}
	
	public static int[] flip(int[] arr, int flip_index) {
		for(int i = 0; i <= (flip_index) /2; i++) {
			int tmp = arr[i];
			arr[i] = arr[flip_index - i];
			arr[flip_index - i] = tmp;
		}
 		
		return arr;
	}
	
	public static int maxIndex(int[] arr, int startIndex, int endIndex) {
		int max_val = -1;
		int max_val_index = -1;
		for(int i = startIndex; i <= endIndex; i++) {
			if(arr[i] > max_val) {
				max_val_index = i;
				max_val = arr[i];
			}	
		}
		return max_val_index;
	}

	
}
