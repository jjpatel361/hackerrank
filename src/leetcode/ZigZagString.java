package leetcode;

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
}
