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
		//int rows = (int) Math.floor(Math.sqrt(L));
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
		
	}
	
	
	
	
	public static void main1(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("./data/encryption"));
		String data = sc.nextLine();
		//System.out.println(data);
		sc.close();
		
		int L = data.length();
		int rows = (int) Math.floor(Math.sqrt(L));
		int cols = (int) Math.ceil(Math.sqrt(L));
		
		char[] chardata = data.toCharArray();
		char[][] master = new char[cols][cols];
		
		int k = 0;
		
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < cols; j++) {
				if(k > chardata.length -1){
					break;
				}
				master[i][j] = chardata[k];
				k++;
			}
		}
				
		String encrypted_result = "";
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < cols; j++) {
				encrypted_result += master[j][i];
			}
			encrypted_result += " ";
		}
		
		
		System.out.print(encrypted_result.trim());
		
		
	}

}
