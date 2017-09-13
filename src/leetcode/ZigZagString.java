package leetcode;

import java.util.Arrays;

public class ZigZagString {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		String p = convert(s, 3);
		System.out.println(p);
	}

	private static String convert(String s, int numRows) {
		
		//char array
		char[] c = s.toCharArray();
		int len = c.length;
		
		// create string buffers for each row
		StringBuffer[] sb = new StringBuffer[numRows];
		
		for (int i = 0; i < sb.length; i++) {
			sb[i] = new StringBuffer();
		}
		
		int i = 0;
		
		while(i < len) {
			//vertical section n times
			for (int idx = 0; idx < numRows && i<len; idx++) {
				sb[idx].append(c[i++]);
			}
			
			// slanting section n - 2 times
			for (int idx = numRows -2; idx >= 1 && i < len; idx--) {
				sb[idx].append(c[i++]);
			}
		}
		
		for (int idx = 1; idx < sb.length; idx++) {
			sb[0].append(sb[idx]);
		}
		
		return sb[0].toString();
	}
	
	
	
	
	
	/*public static char[] convert(String s, int numRows) {
		char[] source = s.toCharArray();
		char[] result = new char[100];
		int k = 0;
		int n = numRows;
		
		for (int j = 0; j < result.length; j++) {
			
			for (int p = 0; p <= n-1; p++) {

				if(k <= source.length - 1) {
					result[j] = source[k];
					k++;
					j++;
				}else {
					break;
				}
			}
			
			for (int p = 0; p < n - 2; p++) {
				
				if(k <= source.length - 1 ) {
				
					result[j+n-2] = source[k];
					k++;
					j = j + n -1;
				
				}else {
					break;
				}
				
			}
			
			if(k > source.length -1) {
				break;
			}
			
		}
		
        return result;
    }*/

}
