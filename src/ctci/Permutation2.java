package ctci;

import java.util.Arrays;

public class Permutation2 {

	public static void main(String[] args) {
		// 1, 12, -3 
		// 1 - 12 => -11 
		// -3 * -11 => 33
		double[] num = new double[]{10, 12};
		
		// all possible permutation 
		// 1 + 12 => 13
		// 1 - 12 => -11
		// 1 * 12 => 1/12
		// 1 / 12 
		permute(num);
	}
	
	
	public static void permute(double[] data){
		
		double[] min = new double[data.length];
		double[] max = new double[data.length];
		
		min[0] = data[0];
		max[0] = data[0];
		
		for(int i = 1; i < data.length; i++) {
			
			double[] option1 = helper(min[i-1], data[i]);
			double[] option2 = helper(max[i-1], data[i]);
			
			min[i] = Math.min(option1[0], option2[0]);
			max[i] = Math.max(option1[1], option2[1]);
			
		}
		
		System.out.println(Arrays.toString(min));
		System.out.println(Arrays.toString(max));
		
	}
	
	
	public static double[] helper(double num1, double num2) {
		
		double[] temp = new double[4];
		temp[0] = num1 * num2;
		temp[1] = num1 + num2;
		temp[2] = num1 - num2;
		temp[3] = num1 / num2;
		
		Arrays.sort(temp);
		
		return new double[]{temp[0], temp[3]};
	}

}
