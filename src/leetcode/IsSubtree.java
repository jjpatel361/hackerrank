/**
 * 
 */
package leetcode;

import models.TreeNode;

/**
 * @author Jay Patel
 *
 */
public class IsSubtree {

	public static boolean isSubtree(TreeNode parentTree, TreeNode childTree) {
		
		if(childTree == null) return false;
		
		// match pattern  
		return compareTree(parentTree, childTree);
		
	}

	private static boolean compareTree(TreeNode ref1, TreeNode ref2) {
		
		
		String ref1_inorder = getInOrderTraversal(ref1);
		
		String ref1_preorder = getPreOrderTraversal(ref1);
		
		String ref2_inorder = getInOrderTraversal(ref2);
		
		String ref2_preorder = getPreOrderTraversal(ref2);
		 
		System.out.println(ref1_inorder);
		System.out.println(ref2_inorder);
		
		System.out.println(ref1_preorder);
		System.out.println(ref2_preorder);
		
		return (ref1_inorder.contains(ref2_inorder) && ref1_preorder.contains(ref2_preorder));
	}

	private static String getPreOrderTraversal(TreeNode ref) {
		
		if(ref == null) {
			return "null";
		}
		
		String left_sb = getPreOrderTraversal(ref.left);
		
		String right_sb = getPreOrderTraversal(ref.right);
		
		return (ref.val + "->" + left_sb + "->" + right_sb);
	}

	private static String getInOrderTraversal(TreeNode ref1) {
		
		if(ref1 == null) {
			return "null";
		}
		
		String left_sb = getInOrderTraversal(ref1.left);
		
		String right_sb = getInOrderTraversal(ref1.right);
		
		return (left_sb + " -> " + ref1.val + "->" + right_sb);
	}


}
