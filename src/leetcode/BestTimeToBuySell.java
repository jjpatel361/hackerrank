/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class BestTimeToBuySell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Profit : " + maxProfit(new int[]{7,1,5,3,6,4}));
	}
	
	public static int maxProfit(int[] prices) {
        /*
           
        
        */
        int buy_price = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++) {
            buy_price = Math.min(prices[i], buy_price);
            profit = Math.max(profit, prices[i] - buy_price);
        }
        
        return profit;
        
    }

}
