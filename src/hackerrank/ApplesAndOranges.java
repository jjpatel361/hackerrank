package hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.System;

public class ApplesAndOranges {

	/*
	 * @description https://www.hackerrank.com/challenges/apple-and-orange
	 * */
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("./data/applesoranges.txt"));
		int s = sc.nextInt(); // starting point of house
		int t = sc.nextInt(); // end point of house
		int a = sc.nextInt(); // apple tree location
		int b = sc.nextInt(); // orange tree location
		int m = sc.nextInt(); // number of apples
		int n = sc.nextInt(); // number of oranges
		
		int applescount = 0;
		
		while(m >0) {
			int d = sc.nextInt();
			if(s <= a+d && a+d <= t) {
				applescount++;
			}
			m--;
		}	
		
		int orangescount = 0;
		while(n > 0) {
			int d = sc.nextInt();
			if(t>= b+d && s<= b+d) {
				orangescount++;
			}
			n--;
		}
		System.out.println(applescount);	
		System.out.println(orangescount);
		

	}

}
