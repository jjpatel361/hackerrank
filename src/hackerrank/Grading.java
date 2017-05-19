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
		s.nextInt();
		while (s.hasNextInt()) {
			int grade = s.nextInt();
			int nearest = (int) Math.ceil(grade/5);
			if(Math.abs(grade - nearest) <= 3){
				System.out.println(nearest);
			}else{
				System.out.println(grade);
			}
		}
		s.close();
		
		
		
	}

}
