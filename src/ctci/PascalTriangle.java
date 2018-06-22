package ctci;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PascalTriangle {

	public static void main(String[] args) {
		
		generate(5);	
		
	}
	
	public static List<List<Integer>> generate(int numRows) {
        
    	
		ArrayList<List<Integer>> data = new ArrayList<List<Integer>>();
		
		List<Integer> row = new ArrayList<Integer>();
		row.add(1);
		data.add(row);
	
		Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        q.add(1);
        q.add(0);        
        
        while(numRows > 0) {
        	
        	Queue<Integer> nextQueue = new LinkedList<Integer>();
            
        	row = new ArrayList<Integer>();
        	
            int firstValue = q.peek();
            
            nextQueue.add(firstValue);
            
            while(q.size() > 1) {
            
            	int f = q.remove();
            	int r = q.peek();
                nextQueue.add(f+r);           
                row.add(f+r);
            }
            
            nextQueue.add(q.remove());
            //System.out.println("Next " + nextQueue.toString());
            System.out.println(row.toString());
            data.add(row);
            q = nextQueue;
            numRows--;
        }
        
        return data;
        
    }

}
