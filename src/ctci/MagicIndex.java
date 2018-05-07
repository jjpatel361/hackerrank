package ctci;

public class MagicIndex {

	/*
		Find magic index in array if it exists 
		return i where i = A[i]
	*/

	public static void main(String args[]) {
		// int[] arr = new int[]{1, 2, 3, 4, 4, 6};
		int[] arr = new int[]{1, 2, 2, 5, 6, 14};
		int index = binarySearch(arr, 0, arr.length- 1);
		System.out.println("Magic Index : " + index);
	}
	
	public static int findMagicIndexLinear(int[] data) {
		int index = -1;
		for(int i = 0; i < data.length; i++) {
			if(data[i] == i) {
				index = i;
				break;
			}		
		};
		return index;
	}
	
	public static int binarySearch(int[] arr, int si, int ei) {
		
		if(si > ei) {
			return -1;
		}
		
		// find mid point 
		int midpoint = si + ((ei - si)/2);
		
		if(arr[midpoint] == midpoint) {
			return midpoint;
		}	
		
		// if a[midpoint] > midpoint 
		// traverse left half
		if(arr[midpoint] > midpoint) {
			return binarySearch(arr, midpoint+1, ei);
		}
		
		// if a[midpoint] < midpoint 
		// traverse right half
		if(arr[midpoint] < midpoint ) {
			return binarySearch(arr, si, midpoint -1);
		}
		
		return -1;
	}
}
