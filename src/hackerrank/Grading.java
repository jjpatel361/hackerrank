/**
 * 
 */
package hackerrank;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Jay Patel
 * @hackerrank https://www.hackerrank.com/challenges/grading
 *
 */
public class Grading {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("./data/grading.txt"));
		int[] data = new int[s.nextInt()];
		int c = 0;
		while (s.hasNextInt()) {
			data[c] = s.nextInt();
			c++;
		}
		s.close();
		int[] graded = solve(data);
		System.out.println(graded);
		
	}

	private static int[] solve(int[] data) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length; i++) {
			int grade = data[i];
			int nearest = grade + (5 - (grade%5));
			if(Math.abs(grade - nearest) < 3 && grade >= 38){
				data[i] = nearest;
			}else{
				data[i] = grade;
			}
		}
		return data;
	}

}
