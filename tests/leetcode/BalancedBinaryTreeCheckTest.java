/**
 * 
 */
package leetcode;

import org.junit.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import models.TreeNode;

/**
 * @author Jay Patel
 *
 */
public class BalancedBinaryTreeCheckTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link leetcode.BalancedBinaryTreeCheck#isBalanced(models.TreeNode)}.
	 */
	@Test
	public void testIsBalanced() {
		/*   	3
			   / \
			  9  20
			    /  \
			   15   7
		 * 
		 * 
		 * */
		TreeNode leaf_1 = new TreeNode(7);
		TreeNode leaf_2 = new TreeNode(15);
		TreeNode node_l2 = new TreeNode(20);
		node_l2.left = leaf_2;
		node_l2.right = leaf_1;
		TreeNode node_l2_9 = new TreeNode(9);
		TreeNode root = new TreeNode(3);
		root.left = node_l2_9;
		root.right = node_l2;
		
		boolean actual = BalancedBinaryTreeCheck.isBalanced(root);
		
		Assert.assertTrue(actual);	
	}

}
