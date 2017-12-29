package leetcode;

import java.util.Arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] heights = new int[]{1,1};
		int a = maxArea(heights);
		System.out.println(a);
		
	}
	
	
	 public static int maxArea(int[] heights) {
         int startIndex = 0, endIndex = heights.length-1, maxAreaExplored = 0;
         
         while(startIndex < endIndex) {
        	 
        	 // Calculate min area 
        	 int min_height = heights[startIndex] > heights[endIndex] ? heights[endIndex] : heights[startIndex];
        	 int area = min_height * (endIndex - startIndex);
        	 
        	 if(area > maxAreaExplored) {
        		 maxAreaExplored = area;
        	 }
        	 
        	 if(heights[startIndex] > heights[endIndex]) {
        		 // decrement window from endIndex 
        		 endIndex--;
        	 }else {
        		 // decrement window from startIndex
        		 startIndex++;
        	 }
        	 
         }
         
		 return maxAreaExplored;
        
    }

}
