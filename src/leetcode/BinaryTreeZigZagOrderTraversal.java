/**
 * 
 */
package leetcode;


import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import models.TreeNode;

/**
 * @author Jay Patel
 *
 */
public class BinaryTreeZigZagOrderTraversal {

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		ArrayList<List<Integer>> allLevelNodes = new ArrayList<List<Integer>>();
		
		if (root == null) return allLevelNodes;
		
		
		Deque<TreeNode> queue = new LinkedList<TreeNode>();
		queue.addFirst(root);
		
		
		int queued_nodes = queue.size();
		boolean zigTraversal = false;
		
		
		
		while(!queue.isEmpty()) {
			
			List<Integer> levelNodeVal = new ArrayList<>();
			while(queued_nodes > 0) {
				TreeNode curr_node;
				if(zigTraversal) {
					
					curr_node = queue.removeFirst();
					if(curr_node.right != null) queue.addLast(curr_node.right);
					if(curr_node.left != null) queue.addLast(curr_node.left);
					
					
				}else {
					//zag order
					curr_node = queue.removeLast();
					if(curr_node.left != null) queue.addFirst(curr_node.left);
					if(curr_node.right != null) queue.addFirst(curr_node.right);
				}
				levelNodeVal.add(curr_node.val);
				queued_nodes--;				
			}
			
			zigTraversal = !zigTraversal;
			queued_nodes = queue.size();
			
			allLevelNodes.add(levelNodeVal);	
			
		}
		
		return allLevelNodes;
	}

}
