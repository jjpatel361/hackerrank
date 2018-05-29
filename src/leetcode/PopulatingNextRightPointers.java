/**
 * 
 */
package leetcode;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Assert;

import models.TreeLinkNode;

/**
 * @author Jay Patel
 *
 */
public class PopulatingNextRightPointers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*TreeLinkNode root = new TreeLinkNode(1);
		root.left = new TreeLinkNode(2);
		root.right = new TreeLinkNode(3);

		connect(root);
		
		Assert.assertEquals(root.next, null);
		Assert.assertEquals(root.left.next, root.right);
		Assert.assertEquals(root.right.next, null);
		*/
		Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
		q.add(new TreeLinkNode(10));
		q.add(new TreeLinkNode(12));
		q.add(new TreeLinkNode(14));
		for(TreeLinkNode t : q) {
			System.out.println(t.val);
		}
		System.out.println(q.size());
	}

	public static void connect(TreeLinkNode root) {

		System.out.println(root);
		if (root == null)
			return;
		walk(root, null);
		walk(root.right, null);
	}

	public static void walk(TreeLinkNode currentNode, TreeLinkNode rightTree) {

		// base case leaf reached.
		if (currentNode == null || currentNode.left == null && currentNode.right == null) {
			return;
		}

		System.out.println("CurrentNode : " + currentNode.val + 
						   " Left: " + currentNode.left +
						   " Right : " + currentNode.right);

		currentNode.next = rightTree;

		TreeLinkNode leftTree = rightTree == null ? null : rightTree.left;

		// walk left
		walk(currentNode.right, leftTree);
		walk(currentNode.left, currentNode.right);

	}

}
