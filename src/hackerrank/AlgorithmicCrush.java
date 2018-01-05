package hackerrank;

import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * You are given a list of size N , initialized with zeroes. 
 * You have to perform M operations on the list and 
 * output the maximum of final values of all the N elements in the list.
 * For every operation, you are given three integers a,b and c 
 * and you have to add value k to all the elements ranging from index  to (both inclusive).
 *  
 * @info https://www.hackerrank.com/challenges/crush
 * */
public class AlgorithmicCrush {

	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc = new Scanner(new File("./data/algocrush.txt"));;
		Scanner sc = new Scanner(System.in);
		String[] info = sc.nextLine().split(" ");
		int array_size = Integer.parseInt(info[0]);
		
		int number_operations = Integer.parseInt(info[1]);
		
		long[] stack = new long[array_size+1];
		
		String line = sc.nextLine();
		
		for (int i = 0; i < number_operations; i++) {
			String[] op = line.split(" ");
			int start_index= Integer.parseInt(op[0]);
			int end_index = Integer.parseInt(op[1]);
			int scale = Integer.parseInt(op[2]);
			stack[start_index -1] += scale;
			stack[end_index] += (scale *-1);
			//System.out.println(Arrays.toString(stack));
			line = sc.hasNextLine() ? sc.nextLine() : null;
		}
		
		
		//Find Prefix Sum
		long max = 0;
		for (int i = 1; i < stack.length; i++) {
			stack[i] = stack[i -1] + stack[i] ;
			if(stack[i] > max){
				max = stack[i];
			}
		}
//		System.out.println("********");
//		System.out.println(Arrays.toString(stack));
		System.out.println(max);

	}

}
