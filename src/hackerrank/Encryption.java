package hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Encryption
 * @hackerrank https://www.hackerrank.com/challenges/encryption
 * 
 * */
public class Encryption {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("./data/encryption"));
		String data = sc.nextLine();
		sc.close();
		int L = data.length();
		int cols = (int) Math.ceil(Math.sqrt(L));
		int skipstep = cols;
		char[] chardata = data.toCharArray();
		for (int i = 0; i < cols; i++) {
			String tmp = "";
			for (int j = 0; i+j < L; j+=skipstep) {
				tmp += chardata[i+j];
			}
			System.out.print(tmp + " ");
		}
		
		System.exit(0);
	}
}
