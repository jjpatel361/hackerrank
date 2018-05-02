package leetcode;

public class HouseRobbers {

	
	public int rob(int[] nums) {
		int[] houses = new int[] {2,3};	
		int max_possible_rob = countMaxAmount(houses, 0, houses.length - 1);
		System.out.println("Rob " +max_possible_rob);
		return 0;
	}
	
	public int countMaxAmount(int[] houses, int startIndex, int endIndex) {
		
		System.out.println("StartIndex : " + startIndex + " EndIndex : " + endIndex);
		if(startIndex > endIndex) {
			return 0;
		}
		if(startIndex == endIndex) {
			return houses[startIndex];
		}
		
		if(endIndex - startIndex == 1) {
			return Math.max(houses[startIndex] , houses[endIndex]);
		}
		
		// taking the first element as choice
		int first_option = houses[startIndex] + countMaxAmount(houses, startIndex + 2, endIndex);
		
		int second_option = houses[startIndex + 1] + countMaxAmount(houses, startIndex + 3, endIndex);
		
		return Math.max(first_option, second_option);
	}
}
