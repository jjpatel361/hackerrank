/**
 * 
 */
package data.structres.sll;

import java.io.IOException;
import java.util.ArrayList;

import data.utils.DataUtil;

/**
 * @author Jay Patel
 * @hackerank https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
 * @description Get value from node. If position from tail is given. 0 is tail position and 1 is second last element 
 * 
 * 
 *  */
public class GetNode {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		DataUtil util = new DataUtil();
		ArrayList<Integer> data = util.readFile("./data/singlelinkedlist.txt");
		Node sl = SingleLinkedList.createSingleLinkedList(data);
		int node_val = SingleLinkedList.getNode(sl, 4);
		System.out.println(node_val);
	}

}
