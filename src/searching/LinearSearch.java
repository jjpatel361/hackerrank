package searching;

import java.io.IOException;
import java.util.ArrayList;

import data.utils.DataUtil;

public class LinearSearch {
/*
 * Algo category : Searching
 * Time Complexity : O(n)
 * Comparisons : n
 * 
 * */
	
	
	public static void main(String[] args) throws IOException {
		DataUtil util = new DataUtil();
		ArrayList<Integer> data = util.readFile("./data/search.txt");
		// Item to search 
		int search_key = 65500;
		boolean isPresent = LSearch(data, 0, data.size(), search_key);
		System.out.println("Value "+ search_key + " : " + isPresent);
		
	}
	
	public static boolean LSearch(java.util.ArrayList<Integer> data, int startPos,int endPos, int search_key){
		for (int i = startPos; i < endPos; i++) {
			int key = data.get(i);
			if(key == search_key){
				return true;
			}
		}
		return false;
	}

}
