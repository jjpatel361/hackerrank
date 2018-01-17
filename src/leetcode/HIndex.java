
/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author Jay Patel
 *
 */
public class HIndex {

	public static int hIndex(int[] citations) {
		
		// empty array return 0
		if(citations.length == 0) return 0;
		
		// array with just one element should return 1 if the element in array != 0
		if(citations.length == 1 && citations[0] != 0) return 1;
		
		if(citations.length == 1 && citations[0] == 0) return 0;

		Arrays.sort(citations);

		for (int i = 0; i < citations.length / 2; i++) {
			int tmp = citations[i];
			citations[i] = citations[citations.length - 1 - i];
			citations[citations.length - 1 - i] = tmp;
		}
		
		int max_length = 0 ;
		for (int i = 0; i < citations.length; i++) {
			if(citations[i] > i) {
				max_length++;
			}
		}
		return max_length;
	}
}
