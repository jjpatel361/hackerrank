/**
 * 
 */
package ctci;

import java.util.ArrayList;

import models.TreeNode;

/**
 * @author Jay Patel
 *
 */
public class LowestCommonAncestor {
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	
		return recursion(root, p, q);
		
	}

	public static ArrayList<Integer> inorderTraversal(TreeNode root, ArrayList<Integer> master) {
		
		if(root == null) {
			// base case
			return master; 
		}
		
		if(root.left == null && root.right == null) {
			// leaf node reached.
			master.add(root.val);
			return master;
		}
		
		if(root.left != null){
			inorderTraversal(root.left, master);
		}
		
		master.add(root.val);
		
		if(root.right != null) {
			inorderTraversal(root.right, master);
		}
		
		
		return master;
	}
	
	public static TreeNode recurse(TreeNode node, TreeNode targeta ,TreeNode targetb, ArrayList<Integer> inorder_walk ) {
		
		int index_root = inorder_walk.indexOf(node.val);
		int targeta_idx = inorder_walk.indexOf(targeta.val);
		int targetb_idx = inorder_walk.indexOf(targetb.val);
		
		System.out.println("Root " + node.val);
		
		if(
			targeta_idx <= index_root && targetb_idx >= index_root ||
			targetb_idx <= index_root && targeta_idx >= index_root 
		   ) {
			System.out.println("Found node " + node.toString());
			return node;
		}
		
		//if both are on left side
		if(
			targeta_idx < index_root &&
			targetb_idx < index_root
				) {
			System.out.println("Traversing Left ");
			return recurse(node.left, targeta, targetb, inorder_walk);
		}
		
		
		if(
			targeta_idx > index_root &&
			targetb_idx > index_root
				) {
			System.out.println("Traversing Right");
			return recurse(node.right, targeta, targetb, inorder_walk);
		}
		
		return null;
	}
	
	public static TreeNode recursion(TreeNode root, TreeNode a, TreeNode b) {
		
		if(root == null) return null;
		
		if(root == a || root == b) return root;
		
		TreeNode left = recursion(root.left, a, b);
		TreeNode right = recursion(root.right, a, b);
		
		if(left != null && right !=null) {
			return root;
		}
		
		if(left == null) {
			return right;
		}else {
			return left;
		}
		
	}
	
}
