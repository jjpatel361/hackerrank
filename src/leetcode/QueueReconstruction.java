/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Jay Patel
 *
 */
public class QueueReconstruction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

	public static int[][] reconstructQueue(int[][] people) {
		
		Arrays.sort(people, new Comparator<int[]>() {
            
			public int compare(int[] p1, int[] p2) {
            	
                if (p1[0] != p2[0]) return p2[0] - p1[0];
                
                else return p1[1] - p2[1];
            }
        });
        
		ArrayList<int[]> tmp = new ArrayList<>();
        
        for (int i = 0; i < people.length; i++) {
        	tmp.add(people[i][1], people[i]);
        }
        
        /*for (int i = 0; i < tmp.size(); i++) {
			System.out.println(tmp.get(i)[0] + " : " + tmp.get(i)[1]);
		}*/
        
        int[][] res = new int[people.length][2];
        
        for (int i = 0; i < tmp.size(); i++) {
            res[i][0] = tmp.get(i)[0];
            res[i][1] = tmp.get(i)[1];
        }
        
        return res;
		
	}

}
