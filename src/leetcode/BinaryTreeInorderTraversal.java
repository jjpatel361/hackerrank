/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

import core.MyStack;
import models.TreeNode;

/**
 * @author Jay Patel
 *
 */
public class BinaryTreeInorderTraversal {

	public static void main(String[] args) throws IllegalAccessException {
		
		TreeNode root = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		
		two.left = four;
		two.right = five;
		
		root.left = two;
		root.right = three;
		
		
		
		inorderTraversal(null).forEach(s-> System.out.println(s));
		
		
	}
	
	 public static List<Integer> inorderTraversal(TreeNode root) throws IllegalAccessException {
	     
		 java.util.Stack<TreeNode> stack = new java.util.Stack<TreeNode>();
	     List<Integer> result = new ArrayList<Integer>();
	     
	     if(root == null ){
	    	return result; 
	     }
	     
	     stack.push(root);
	     TreeNode currentNode = root;
	     
	     // populate the stack with all left elements
	     while(currentNode.left != null){
	    	 stack.push(currentNode.left);
	    	 currentNode = currentNode.left;
	     }
	     	     
	     while(!stack.isEmpty()) {
	    	 // Step 1:  pop stack item
	    	 TreeNode item = stack.pop();
	    	 
	    	 // Add it to the result list.
	    	 result.add(item.val);
			 
			 if(item.right != null) {
				 item = item.right;
				 // Traverse till the leftmost of right node
				while(item != null){
					//push it to stack	
					stack.push(item);
					item = item.left;
				}
				
			 } 
	     }
	     
		 
		 return result;
	 }
	 
	 
}
