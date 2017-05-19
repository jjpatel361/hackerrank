package sorting;

import java.io.IOException;
import java.util.ArrayList;

import data.utils.DataUtil;

public class BubbleSort {
	
	/*
	 * Algorithm : Bubble Sort (Odd even transposition) 
	 * Category : Sorting
	 * Time Complexity : O(n2)
	 * No. Comparisons : O(n)
	 *  
	 * */

	public static void main(String[] args) throws IOException {
		DataUtil util = new DataUtil();
		//java.util.ArrayList<Integer> data = DataUtil.generateRandomData(100,500);
		//util.saveResult(data, "./data/unsorteddata.txt");
		java.util.ArrayList<Integer> data= util.readFile("./data/unsorteddata.txt");
		System.out.println("Data Size "+ data.size());
		ArrayList<Integer> sortedData = BSort(data);
		util.saveResult(sortedData, "./data/bubbleSort.txt");
		System.out.println(sortedData);	
	}
	
	public static ArrayList<Integer> BSort(java.util.ArrayList<Integer> data){
		int len = data.size();
		for (int i = 0; i < len; i++) {
			EvenTransposition(data);
			OddTransposition(data);
		}
		return data;
	}

	private static void OddTransposition(ArrayList<Integer> data) {
		for (int i = 1; i < data.size()-1; i=i+2) {
			int current_data = data.get(i);
			int next_data = data.get(i+1);
			if(current_data > next_data) {
				data.set(i, next_data);
				data.set(i+1, current_data);
			}
		}		
	}

	private static void EvenTransposition(ArrayList<Integer> data) {
		for (int i = 0; i < data.size()-1; i=i+2) {
			int current_data = data.get(i);
			int next_data = data.get(i+1);
			if(current_data > next_data) {
				data.set(i, next_data);
				data.set(i+1, current_data);
			}
		}
	}

}
