/**
 * 
 */
package leetcode;

import java.util.PriorityQueue;

/**
 * @author Jay Patel
 *
 *  https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 *  
 *  
 */
public class KthLargest {

	 public static int findKthLargest(int[] nums, int k) {
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 
		 for (Integer i : nums) {
			pq.add(i);
			if(pq.size() > k) {
				pq.poll();
			}
			//System.out.println(pq.peek());
		}
		 return pq.peek();
	 }
	 
	 public static int partition(int[] nums, int startIndex, int endIndex, int k) {
		 
		 // default pivot is taken as first value at startIndex
		 int pivotIndex = startIndex, tmp = 0;
		 int lo = startIndex, hi = endIndex; 
		 
		 while(startIndex < endIndex) {
			 if(nums[startIndex] < nums[pivotIndex]) {
				 //swap 
				 tmp = nums[startIndex];
				 nums[startIndex] = nums[pivotIndex];
				 nums[pivotIndex] = tmp;
				 pivotIndex = startIndex;
			 }
			 startIndex++;
		 }
		 
		 // find nums less than pivot 
		 
		 if(pivotIndex == k-1){
			 return nums[pivotIndex];
		 }else if(pivotIndex < k-1) {
			 // traverse right half pivotIndex to endIndex
			 return partition(nums, pivotIndex +1, hi, k);
		 }else {
			 // traverse left half startIndex to pivotIndex
			 return partition(nums, lo, pivotIndex -1, k);
		 }
		 
	 }
}

