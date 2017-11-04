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
 * @see <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/solution/#approach-3-morris-traversal-accepted"> Answer in LeetCode </a>
 * 
 * @see {@link <a href="http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/"> GoG Morris traversal </a> }
 */
public class BinaryTreeInorderMorrisTraversal {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		
		two.left = four;
		two.right = five;
		
		root.left = two;
		root.right = three;
		
		inorderTraversal(root).forEach(s-> System.out.println(s));
	}
	
	 public static List<Integer> inorderTraversal(TreeNode root) {
		 
		 // Make current item as null
		 TreeNode currentNode = root;
		 List<Integer> result = new ArrayList<Integer>();
		 
		 if(currentNode==null) return result;
		 
		 while(currentNode != null) {
			 
			 if(currentNode.left == null) {
				 //System.out.println(currentNode.val);
				 result.add(currentNode.val);
				 currentNode = currentNode.right;
			 }else {
				 // Left is  present 
				 // find the right most point of left subtree
				 TreeNode pre = currentNode.left;
				 while(pre.right != null  && pre.right != currentNode){
					 pre = pre.right;
				 }
				 // Add threading to the right node
				 if(pre.right == null) {
					 pre.right = currentNode;
					 // Move to left now
					 currentNode = currentNode.left;
				 }
				 else {
					 pre.right = null;
					 result.add(currentNode.val);
					 currentNode = currentNode.right;
				 }
			 }
			 
		 }
		 
		 return result;
	 }

}
