package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesinArray {
	/*
	 * @description https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
	 * */
	public static void main(String[] args) {
		
		
	}
	
	public  static List<Integer> findDuplicates(int[] nums) {
		int[] bucket = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			bucket[nums[i]]++;
		}
		
		List<Integer> p = new ArrayList<Integer>();
		for (int i = 0; i < bucket.length; i++) {
			if(bucket[i] >= 2) {
				p.add(i);
			}
		} 
		
		return p;
    }

}
