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
public class ValidateBinarySearchTree {
	
	public boolean isValidBST(TreeNode root) {
		
		ArrayList<Integer> sortedArray = inOrderTraversal(root);
		boolean result = true;
		
		result = isSorted(sortedArray);
		
		return result;
		
    }

	/**
	 * @param sortedArray
	 * @param result
	 * @return
	 */
	public static boolean isSorted(List<Integer> sortedArray) {
		boolean result = true;
		for (int i = 0; i < sortedArray.size() - 1; i++) {
			if(sortedArray.get(i) >= sortedArray.get(i+1)) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	
	public static ArrayList<Integer> inOrderTraversal(TreeNode root) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(root == null) {
			return result;
		}
	
		if(root.left != null) {
			ArrayList<Integer> leftSubtree =  inOrderTraversal(root.left);
			result.addAll(leftSubtree);
		}
		
		result.add(root.val);
		
		if(root.right != null) {
			ArrayList<Integer> rightSubtree = inOrderTraversal(root.right);
			result.addAll(rightSubtree);
		}
		
		return result;
		
	}
	
	
	/*
	public boolean isValidBST(TreeNode root, Integer min, Integer max) {
		if(root == null) return true;
		
		if(min != null && root.val <= min) return false;
		if(max != null && root.val >= max) return false;
		
		boolean is_left_subtree_valid = isValidBST(root.left, min, root.val);
		boolean is_right_subtree_valid = isValidBST(root.right, root.val, max);
		
		return is_left_subtree_valid && is_right_subtree_valid;
	}*/

	
	
	
}
