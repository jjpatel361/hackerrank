/**
 * 
 */
package leetcode;

import models.TreeNode;
/**
 * @author Jay Patel
 *
 */
public class BalancedBinaryTreeCheck {

	public static boolean isBalanced(TreeNode root) {
		return isTreeBalanced(root);
	}
	
	public static int traverseHeight(TreeNode node) {
		
		if(node == null) return 0;
		
		if(node.right == null && node.left == null) return 1;
	
		return 1 + Math.max(traverseHeight(node.right), traverseHeight(node.left));
	} 
	
	public static boolean isTreeBalanced(TreeNode root) {
		
		if(root == null) return true;
		
		int left_height = traverseHeight(root.left);
		int right_height = traverseHeight(root.right);
		
		if(Math.abs(right_height - left_height) <= 1 && isTreeBalanced(root.left) && isTreeBalanced(root.right) ) return true;
		 
		return false;
	}
	
}
