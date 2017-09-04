package hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kangaroo {
	
	/*
	 * @description https://www.hackerrank.com/challenges/kangaroo
	 * */

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("./data/kangaroo.txt"));
		
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		
		sc.close();
		
		if(x1 < x2 && v1 > v2 || x1 > x2 && v1 < v2) {
			int n = (x2 - x1) % (v1 - v2);
			if(n == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}else {
			System.out.println("NO");
		}

	}

}
