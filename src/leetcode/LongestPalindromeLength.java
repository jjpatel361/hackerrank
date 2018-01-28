/**
 * 
 */
package leetcode;


/**
 * @author Jay Patel
 *
 */
public class LongestPalindromeLength {
	
	

	public static int longestPalindrome(String s) {
		
		int[] charcount = new int[256];
		
		for (int i = 0; i < s.length(); i++) {
			charcount[s.charAt(i)]++;
		}
			
		int max_length = 0;
		boolean firstOddEncountered = false;
		
		for (int i = charcount.length -1 ; i >= 0; i--) {
			if(charcount[i]==0) continue;
			
			if(charcount[i]% 2 == 0) {
				max_length += charcount[i];
				System.out.println("Adding Even " + charcount[i] + " max length " + max_length);
			}else if(charcount[i]%2 == 1 && !firstOddEncountered) {
				max_length += charcount[i];
				System.out.println("First Odd Element " + charcount[i]);
				firstOddEncountered = true;
			} else if(charcount[i]%2 == 1) {
				max_length += (charcount[i] -1);
				System.out.println("Adding Even Elements of Odd " + charcount[i]);
			}
		}
		
		return max_length;
	}

}
