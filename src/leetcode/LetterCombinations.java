package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/*
 * @description : -https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 * 
 * */
public class LetterCombinations {

	
	public static void main(String[] args) throws FileNotFoundException{
	
		Scanner sc = new Scanner(new File("./data/lettercombinations.txt"));
		String number = " ";
		sc.close();
		List<String> combinations = letterCombinations(number);
		System.out.println("Done");
	}
	
	public static List<String> letterCombinations(String digits) {
		if(digits == null || digits.isEmpty()) {
			return new ArrayList<String>();
		}
		Queue<String> q = new LinkedList<String>();
		q.add("");//initialize q with empty string
		String[] mappings = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs","tuv", "wxyz"};
		char[] numbers = digits.toCharArray();
		for (int i = 0; i < numbers.length; i++) {
			int index = Character.getNumericValue(numbers[i]);
			char[] letters = mappings[index].toCharArray();
			int q_size = q.size();
			
			for (int j = 0; j < q_size; j++) {
				String t = q.poll();
				for (int k = 0; k < letters.length; k++) {
					q.add(t+ letters[k] + "");
				}
			}
		}
		
	    return (List<String>) q;
    }

}
