/**
 * 
 */
package leetcode;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import models.TreeNode;

/**
 * @author Jay Patel
 *
 */
public class BinaryTreeZigZagOrderTraversalTest {

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
	 * Test method for {@link leetcode.BinaryTreeZigZagOrderTraversal#zigzagLevelOrder(models.TreeNode)}.
	 */
	@Test
	public void testZigzagLevelOrder_InitialTest() {
		
		TreeNode three = new TreeNode(3);
		TreeNode nine = new TreeNode(9);
		TreeNode twenty = new TreeNode(20);
		TreeNode fifteen = new TreeNode(15);
		TreeNode seven = new TreeNode(7);
		
		three.left = nine;
		twenty.left = fifteen;
		twenty.right = seven;
		three.right = twenty;
		BinaryTreeZigZagOrderTraversal.zigzagLevelOrder(three);		
	}
	
	@Test
	public void testZigzagLevelOrder_AlternateBetweenNodes_ShouldPass() {
		
		TreeNode root = new TreeNode(0);
		TreeNode l1_1 = new TreeNode(2);
		TreeNode l1_2 = new TreeNode(4);
		
		TreeNode l2_1 = new TreeNode(1);
		TreeNode l2_2 = new TreeNode(3);
		TreeNode l2_3 = new TreeNode(5);
		TreeNode l2_4 = new TreeNode(6);
		
		TreeNode l3_1 = new TreeNode(10);
		TreeNode l3_2 = new TreeNode(13);
		TreeNode l3_3 = new TreeNode(14);
		TreeNode l3_4 = new TreeNode(18);
		TreeNode l3_5 = new TreeNode(20);
		TreeNode l3_6 = new TreeNode(16);
		TreeNode l3_7 = new TreeNode(17);
		TreeNode l3_8 = new TreeNode(19);
		
		
		l2_1.left = l3_1;
		l2_1.right = l3_2;
		
		l2_2.left = l3_3;
		l2_2.right = l3_4;
		
		l2_3.left = l3_5;
		l2_3.right = l3_6;
		
		l2_4.left = l3_7;
		l2_4.right = l3_8;
		
		l1_1.left = l2_1;
		l1_1.right = l2_2;
		l1_2.left = l2_3;
		l1_2.right = l2_4;
		
		
		root.left = l1_1;
		root.right = l1_2;
		
		
		BinaryTreeZigZagOrderTraversal.zigzagLevelOrder(root);		
	}
	
	@Test
	public void testZigZagLevelOrder_NonBalancedTree_ShouldPass(){
		TreeNode root = new TreeNode(0);
		
		TreeNode l1_1 = new TreeNode(2);
		TreeNode l1_2 = new TreeNode(4);
		
		TreeNode l2_1 = new TreeNode(1);
		TreeNode l2_3 = new TreeNode(3);
		TreeNode l2_4 = new TreeNode(-1);
		
		TreeNode l3_1 = new TreeNode(5);
		TreeNode l3_2 = new TreeNode(1);
		TreeNode l3_4 = new TreeNode(6);
		TreeNode l3_6 = new TreeNode(8);
		
		
		l2_1.left = l3_1;
		l2_1.right = l3_2;
		l2_3.right = l3_4;
		l2_4.right = l3_6;
		
		l1_1.left = l2_1;
		l1_2.left = l2_3;
		l1_2.right = l2_4;
		
		root.left = l1_1;
		root.right = l1_2;
		
		BinaryTreeZigZagOrderTraversal.zigzagLevelOrder(root);
		
		
	}
	
	

}
