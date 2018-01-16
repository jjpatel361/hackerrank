/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

import models.TreeNode;

/**
 * @author Jay Patel
 *
 */
public class KthSmallesInBST {
	
	public static void main(String[] args) {
		
//		TreeNode n = new TreeNode(2);
//		n.left = new TreeNode(1);
//		System.out.println(kthSmallest(n, 1));
		
		TreeNode n = new TreeNode(1);
		n.right = new TreeNode(2);
		System.out.println(kthSmallest(n, 1));
		
	}

	static int count = 0;
	static int val = 0;
	static int p = 0;
	
	public static int kthSmallest(TreeNode root, int k) {
		p = k;
		inOrder(root);
		return val;
	}
	
	
	public static void inOrder(TreeNode node)
	{
	
		if (node == null) return;
		
		inOrder(node.left);
		
		if(++count == p) {
	        val = node.val;
	        return;
	    }
		
		inOrder(node.right);
		
		return;
		
	}	

}
