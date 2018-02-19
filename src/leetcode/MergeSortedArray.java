/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author Jay Patel
 *
 */
public class MergeSortedArray {
	
	public static int[] nums1;

	public static void main(String[] args) {
		
		int[] nums1 = new int[4];
		nums1[0] = 1;
		nums1[1] = 4;
		int[] nums2 = new int[3];
		nums2[0] = 2;
		
		int[] expected = new int[]{1,2,4,0,0};
		MergeSortedArray.merge(nums1, 2, nums2, 1);
		
		
		
	}	
	
	

	public static void merge(int[] num1, int m, int[] num2, int n) {
		int[] res = new int[num1.length];
		
		if (m == 0) {res = num2;}
		if (n == 0) {res = num1;}
		
		int k = 0, j = 0;
		if(m > 0 && n > 0) {

			for (int i = 0; i < (m + n); i++) {
			
				// take element nums1
				if( k < m && j > n - 1 || num1[k] < num2[j]) {
					res[i] = num1[k];
					k++;
					continue;
				}
				
				// take element nums2
				if(k > m - 1  && j < n || num1[k] > num2[j]) {
					res[i] = num2[j];
					j++;
					continue;
				}
				
				// put both elements in res
				if(num1[k] == num2[j]) {
					res[i] = num1[k];
					i++;
					res[i] = num2[j];
					j++; k++;
					continue;
				}
				
				
			}
		}	
		
		System.out.println("Merged Result : " + Arrays.toString(res));
		
		nums1 = res;
		
	}
}
