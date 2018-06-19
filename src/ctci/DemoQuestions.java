package ctci;

import java.util.Arrays;

public class DemoQuestions {

	public static void main(String[] args) {

		/*
		 * int p = 65; double sqrt = Math.sqrt(p); double sqrt_c =
		 * Math.ceil(sqrt); double sqrt_f = Math.floor(sqrt);
		 * 
		 * if( (sqrt - sqrt_c) == 0 && (sqrt - sqrt_f) == 0 ){
		 * 
		 * System.out.println("Perfect Square Found ");
		 * 
		 * }else{ System.out.println("Not a perfect square"); }
		 */

		System.out.println(findSquares(12));
		

	}

	public static int findSquares(int n) {
		
		int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int root = 1; root * root <= i; root++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - root * root]);
            }
        }
        
        return dp[n];
	}

	
}
