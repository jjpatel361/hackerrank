/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author Jay Patel
 *
 */
public class ClimbingStairs {

	
static int[] memo = new int[0];
    
	/*
    public static int climbStairs(int n) {

    	if(n <= 2) return n;
    	memo = new int[n+1];
        Arrays.fill(memo, -1);    
        memo[1] = 1;
        memo[2] = 2;
        return recurse(n);
        
	}
    
    public static int recurse(int n) {
        if(n <= 0) return 0;
		
		if(n == 1) return memo[1];
		if(n == 2) return memo[2];
		
        if(memo[n - 1] == -1) {
            memo[n-1] = recurse(n -1);
        }
        
        if(memo[n-2] == -1) {
            memo[n-2] = recurse(n-2);
        }
        
		return memo[n-1] + memo[n-2]; 
    }*/

	public static int climbStairs(int n) {
		
		if(n <= 2) return 0;
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2; i <= n ; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];	
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		 System.out.println(climbStairs(0));
		 System.out.println(climbStairs(1));
		 System.out.println(climbStairs(2));
		 System.out.println(climbStairs(3));
		 System.out.println(climbStairs(4));
	}
}
