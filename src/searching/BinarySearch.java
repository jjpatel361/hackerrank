package searching;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import data.utils.DataUtil;


/**
 * @author Jay Patel 
 * @category : Searching
 * @time : O(logn)
 * @comparisons : n
 *  
*/
public class BinarySearch {
	
	

	public static void main(String[] args) throws IOException {
		DataUtil util = new DataUtil();
		ArrayList<Integer> data = util.readFile("./data/bubbleSort.txt");
		int search_key = 98;
		int index = BSearch(data,data.size(),0, data.size()-1, search_key);
		System.out.println(index);
	}

	private static int BSearch(List<Integer> data,
			int size,
			int startIndex,
			int endIndex,
			int search_key) {
		
		int low = 0 ;
		int high = size;
		
		while(high > low){
			int middle = (int) Math.floor((low+high)/2);
			if(data.get(middle) == search_key ){
				return middle;
			}else if(data.get(middle) > search_key) {
				high = middle -1;
				//System.out.println(low+ ":HIGH");
			}else if(data.get(middle) < search_key) {
				low = middle +1;
				//System.out.println(high + ":LOW");
			}
		}
		return 0;
		
	}

}
