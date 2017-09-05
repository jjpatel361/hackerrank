package hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BestWorstRecords {

	public static void main(String[] args) throws FileNotFoundException {
        
		Scanner in = new Scanner(new File("./data/bestworst.txt"));
        
        int n = in.nextInt();
        
        int[] s = new int[n];
        
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        
        int[] result = getRecord(s);
        
        String separator = "", delimiter = " ";
        
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        
        System.out.println("");
        
        in.close();

		
	}
	
	static int[] getRecord(int[] s){
		int mincount = 0;
		int maxcount = 0;
		int max = s[0];
		int min = s[0];
		
		for (int i = 1; i < s.length; i++) {
			if(s[i] > max) {
				max = s[i];
				maxcount++;
			}else if(s[i] < min) {
				min = s[i];
				mincount++;
			}
			
		}
		return new int[]{maxcount, mincount};
    }

	

}
