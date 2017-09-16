package leetcode;

import models.TreeNode;

public class DepthOfTree {

	/*
	 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
	 * */
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(2);
		
		/*tree.left = new TreeNode(4);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(7);
		
		tree.right = new TreeNode(5);
		tree.right.left = new TreeNode(7);
		tree.right.right = new TreeNode(9);
		
		tree.right.right.left = new TreeNode(34);
		tree.right.right.right = new TreeNode(6);
		tree.right.right.left.left = new TreeNode(14);
		tree.right.right.left.left.left = new TreeNode(16);*/

		int depth = maxDepth(tree);
		System.out.println(depth);
	}

	public static int maxDepth(TreeNode node) {
		if(node==null) {
			return 0;
		}
		return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
    }
}
