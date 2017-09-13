package leetcode;


import java.util.ArrayList;

public class ReverseInteger {

	public static void main(String[] args) {
		int input = 2147483647;
		// 1563847412 2147483651 
		int answer = reverse(input);
		System.out.println(answer);
	}
	
	public static int reverse(int x) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		boolean isNegative = x > 0 ? false : true;
		
		int temp = Math.abs(x);
		
		while(temp > 0) {
			int t = (temp % 10);
			result.add(t);
			temp = temp / 10;
		}
		
		int exp = result.size() - 1;
		int r = 0;
		for (Integer data : result) {
			if(Integer.MAX_VALUE < r + data*Math.pow(10, exp)) {
				r = 0;
				break;
			}else {
				r += data*Math.pow(10, exp);
			}
			exp--;
		}

		if(isNegative) {
			r = -1 * r;
		}
		return r;
    }

}
