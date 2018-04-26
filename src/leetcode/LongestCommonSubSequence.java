package leetcode; 


public class LongestCommonSubSequence {
	
	
	public static void main(String[] args) {
		String param1 = "ABCDGH";
		String param2 = "AEDFHR";
		int len = lcs(param1, param2, param1.length() -1, param2.length() -1);
		System.out.println("Length of the Subsequence is " + len);
	}
	
	/**
	 * @param input string A
	 * @param input string B
	 * @param last_param1_index
	 * @param last_param2_index
	 * @return
	 */
	public static int lcs(String param1, String param2, 
						int last_param1_index, int last_param2_index
						) {
		
		
		System.out.println("*************************");
		System.out.println("Input String A: " + param1.substring(0, last_param1_index+1));
		
		System.out.println("Input String B: " + param2.substring(0, last_param2_index+1));
		
		
		
		// base case if any of the index is 0 
		// return 
		if(last_param1_index < 0 || last_param2_index < 0) {
			System.out.println("Returning as one parameter is empty.");
			return 0;
		}
		
		// if the last element is same
		System.out.println("Comparing  : " +param1.charAt(last_param1_index) +" with " +param2.charAt(last_param2_index) );
		if(param1.charAt(last_param1_index) == param2.charAt(last_param2_index)) {
			System.out.println("Param 1 Index : "+last_param1_index + " Param 1 : " + param1.charAt(last_param1_index) );
			System.out.println("Param 2 Index : "+last_param2_index + " Param 2 : " + param2.charAt(last_param2_index) );
			return 1 + lcs(param1, param2, last_param1_index-1, last_param2_index -1);	
		}
		
		System.out.println("Splitting into tree.");
		System.out.println("Going Left...");
		// if last element is unequal recurse
		int left_half = lcs(param1, param2, last_param1_index -1, last_param2_index);
		System.out.println("Going Right..");
		int right_half = lcs(param1, param2, last_param1_index, last_param2_index -1);
		
		
		System.out.println("*************************");
		return left_half > right_half ? left_half : right_half;
	}
} 