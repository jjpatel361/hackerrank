package leetcode;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		int[] data = new int[] {2,3,-2,4};
		int res = maxProduct(data);
		
	}
	
	 public static int maxProduct(int[] nums) {
	        
	        if(nums.length == 0) return 0;
	        if(nums.length == 1) return nums[0];
	              
	        int min = nums[0];
	        int max = nums[0];
	        
	        int global_max = nums[0];
	        
	        for(int i = 1; i < nums.length ; i++) {
	            
	           
	            if(nums[i] >= 0)  {
	                max = Math.max(nums[i], nums[i]*max);
	                min = Math.min(nums[i], nums[i]*min);                
	            }else {
	                int temp = max;
	                max = Math.max(nums[i], min*nums[i]);
	                min = Math.min(nums[i], temp*nums[i]);
	                
	            }
	            
	            int max_product_explored = Math.max(min, max);
	            
	            global_max = Math.max(global_max, max_product_explored);
	            
	        }
	        
	        return global_max;
	    }

}
