/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

import models.TreeNode;
import java.util.Queue;

/**
 * @author Jay Patel
 *
 */
public class MaximumWidthOfBinaryTree {

	public static int widthOfBinaryTree(TreeNode root) {
		
		// TODO: LEVEL ORDER TRAVERSAL.
		// for each level in binary tree
			// max_width  = max (non null elements in each level, max_width)
		
		//edge case
		if(root == null) return 0;
		
		if(root.left == null && root.right == null ) return 1;
		
		
		int max_width = 0;
		Deque<TreeNode> q = new LinkedList<TreeNode>();
		
		int count = 0;
		
		q.add(root);
		count = 1;
		
		while(!q.isEmpty()) {
			
			// traverse level
			while(count > 0) {
				TreeNode current_element = q.poll();
				count--;
				
				if (current_element != null) {
					q.add(current_element.left);
					q.add(current_element.right);
				}else {
					// add two nulls to represent children.
					q.add(null);
					q.add(null);
				}
			}
			
			// reset count 
			
			// update max_width
			// max_width = node_count > max_width ? node_count : max_width;
			// 
			Deque<TreeNode> tmp = new LinkedList<>();
			//tmp.addAll(q);
			
			int len = length(q);
			if (len == 0) break; // all nodes in level are zero
			System.out.println("Len returned " + len);
			max_width = len > max_width ? len : max_width;
			count = q.size();
			//q = tmp;
						
		}
		
		return max_width;
	}

	public static int length(Deque<TreeNode> q) {
		
		while(!q.isEmpty() && q.peekFirst() == null) {q.pollFirst();}
		
		while(!q.isEmpty() && q.peekLast() == null) {q.pollLast();}
		
		return q.size();
	}
}
