package leetcode;

public class MaximumSumofArray {

	public static void main(String[] args) {
		int[] data = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int max_sum = maxSumArray(data);		
		System.out.println("Maximum Sum : " + max_sum);
		
	}
	
	
	public static int maxSumArray(int[] data) {
		int max_explored = Integer.MIN_VALUE;
		int local_max = 0;
		for(int i = 0; i < data.length; i++) {
			local_max = Math.max(data[i], data[i] + local_max);
			max_explored = Math.max(max_explored, local_max);
		}	
		return max_explored;
	}
	
}
