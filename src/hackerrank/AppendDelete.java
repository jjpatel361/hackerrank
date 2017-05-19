/**
 * 
 */
package hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Jay Patel
 * @description https://www.hackerrank.com/challenges/append-and-delete?h_r=next-challenge&h_v=zen
 */
public class AppendDelete {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("./data/appenddelete.txt"));
		String smallword = sc.next();
		String longword = sc.next();
		int operations = sc.nextInt();
		sc.close();
		
		if(smallword.length() > longword.length()) {
			String tmp = longword;
			longword = smallword;
			smallword = tmp;
		}
		
		//Find longest common substring 
		
		//System.out.println("Shortword " + smallword);
		int charpointer = 0;
		while( charpointer < smallword.length() &&
				smallword.charAt(charpointer) == longword.charAt(charpointer ) 
				){
			charpointer += 1;
		}
		
		int add_operations_long = longword.substring(charpointer, longword.length()).length();
		int delete_operations_small = smallword.substring(charpointer, smallword.length()).length();
		if(add_operations_long + delete_operations_small <= operations){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		
	}

}
