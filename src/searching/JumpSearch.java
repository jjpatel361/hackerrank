/**
 * 
 */
package searching;

import java.io.IOException;
import java.util.ArrayList;

import data.utils.DataUtil;

/**
 * @author Jay Patel
 * Category : Searching
 * Time Complexity : O(root(n))
 * 
 * Like Binary Search, Jump Search is a searching algorithm for sorted arrays. The basic idea is to check fewer elements (than linear search) by jumping ahead by fixed steps or skipping some elements in place of searching all elements.

For example, suppose we have an array arr[] of size n and block (to be jumped) size m. Then we search at the indexes arr[0], arr[m], arr[2m]…..arr[km] and so on. Once we find the interval (arr[km] < x < arr[(k+1)m]), we perform a linear search operation from the index km to find the element x.

Let’s consider the following array: (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610). Length of the array is 16. Jump search will find the value of 55 with the following steps assuming that the block size to be jumped is 4.
STEP 1: Jump from index 0 to index 4;
STEP 2: Jump from index 4 to index 8;
STEP 3: Jump from index 8 to index 16;
STEP 4: Since the element at index 16 is greater than 55 we will jump back a step to come to index 9.
STEP 5: Perform linear search from index 9 to get the element 55.
 */
public class JumpSearch {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		DataUtil util = new DataUtil();
		ArrayList<Integer> data = util.readFile("./data/bubbleSort.txt");
		int search_key = 198;
		int jump_size = 2;
		int index = JumpSearch(data, jump_size, search_key);
		System.out.println("Index of search_key is " + index);
		
	}

	private static int JumpSearch(ArrayList<Integer> data, int jump_size, int search_key) {
		
		if(data.get(0) == search_key) {
			return 0;
		}
		
		int index_num = 0;
		
		int k = 0;
		
		while(data.get(index_num) < search_key ) {
			index_num = (int) (Math.pow(2, k) * jump_size);
			k++;
			//System.out.println(index_num);
		}
		
		int startPos = (int) (Math.pow(2, (k -2))*jump_size);
		int endPos = index_num;
		
		for (int i = startPos; i < endPos; i++) {
			//System.out.println(data.get(i));
			if(data.get(i) == search_key) {
				return i;
			}
		}
		return 0;
	}

}
