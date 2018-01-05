/**
 * 
 */
package leetcode;

/**
 * @author Jay Patel
 *
 */
public class Atoi {
	
	public static void main(String[] args) {
		System.out.println(myAtoi("-2147483649"));
		//System.out.println(Long.MIN_VALUE);
		//System.out.println("Min Val " + Integer.MIN_VALUE); //-2147483648
		//System.out.println("Max Val " + Integer.MAX_VALUE); // 2147483647
		
	}
	
	public static int myAtoi(String str) {
		
		// remove spaces
		str = str.trim();
		
		//edge case 
		if("".equalsIgnoreCase(str)) return 0;
		
		if(str.contains(" ")) {
			str = str.split(" ")[0];
		}
		
		char[] r = str.toCharArray();
		
		// "+" or "-" 
		if(r.length == 1) {
			if(r[0] == '-' || r[0] == '+') {
				return 0;
			}
		}
		
		// "+-23" or "-+23"
		if(r.length > 1) {
			if( (r[0] == '+' || r[0] == '-') && (r[1] == '+' || r[1] == '-')) return 0;
		}
		
		// extract sign
		int sign = 1;
		int startIndex = 0, endIndex = r.length -1;
		if(r[0] == '+' || r[0] == '-') {
			sign = r[0] == '-' ? -1 : 1;
			startIndex++;
		} 
		
		// remove prefix zeros
		while( startIndex < endIndex && r[startIndex]=='0') {startIndex++;}
		
		int digitStart = startIndex;
		
		//System.out.println("StartIndex : " + startIndex + " Value " + r[startIndex] );
		
		//find first occurrence of non numeric 
		while(startIndex <= endIndex ) {
			if(r[startIndex] - '0' > 9) {
				break;
			}
			startIndex++;
		}
		
		int digitEnd = startIndex-1;
		
		//System.out.println("StartVal : " + r[digitStart] + " EndVal " + r[digitEnd]);
		int exp = digitEnd - digitStart;
		long answer = 0;
		
		while(digitStart <= digitEnd) {
			answer = (long) (answer + Math.pow(10, exp) * (r[digitStart] - '0')); 
			
			if(sign == 1 && answer >= Integer.MAX_VALUE) {
				answer = Integer.MAX_VALUE;
				break;
			}
			
			if(sign == -1 && -1*answer <= Integer.MIN_VALUE) {
				answer = Integer.MIN_VALUE;
				break;
			}
			
			digitStart++;
			exp--;
		}
		
		return sign*(int) answer;
    }

}
