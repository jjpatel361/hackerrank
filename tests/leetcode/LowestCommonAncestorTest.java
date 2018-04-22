package leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ctci.LowestCommonAncestor;
import helpers.TreeUtils;
import models.TreeNode;

public class LowestCommonAncestorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLowestCommonAncestor() {
	/*		_____3________
	       /              \
	    ___5__          ___1__
	   /      \        /      \
	   6      _2       0       8
	         /  \
	         7   4
	 */
		TreeNode t3 = new TreeNode(3);
		
		TreeNode t5 = new TreeNode(5);
		TreeNode t1 = new TreeNode(1);
		
		TreeNode t6 = new TreeNode(6);
		TreeNode t2 = new TreeNode(2);
		TreeNode t0 = new TreeNode(0);
		TreeNode t8 = new TreeNode(8);
		
		t2.left = new TreeNode(7);
		t2.right = new TreeNode(4);
		t5.left = t6;
		t5.right = t2;
		t1.left = t0;
		t1.right = t8;
		
		t3.left = t5;
		t3.right = t1;
		
		TreeNode r = LowestCommonAncestor.lowestCommonAncestor(t3, t5, t1);
		assertEquals(t3, r);
		
	}
	
	
	@Test
	public void testLowestCommonAncestor_BothLeft() {
	/*		_____3________
	       /              \
	    ___5__          ___1__
	   /      \        /      \
	   6      _2       0       8
	         /  \
	         7   4
	 */
		TreeNode t3 = new TreeNode(3);
		
		TreeNode t5 = new TreeNode(5);
		TreeNode t1 = new TreeNode(1);
		
		TreeNode t6 = new TreeNode(6);
		TreeNode t2 = new TreeNode(2);
		TreeNode t0 = new TreeNode(0);
		TreeNode t8 = new TreeNode(8);
		
		t2.left = new TreeNode(7);
		t2.right = new TreeNode(4);
		t5.left = t6;
		t5.right = t2;
		t1.left = t0;
		t1.right = t8;
		
		t3.left = t5;
		t3.right = t1;
		
		TreeNode r = LowestCommonAncestor.lowestCommonAncestor(t3, t6, t2.left);
		assertEquals(t5, r);
		
	}
	
	@Test
	public void testLowestCommonAncestor_BothRight() {
	/*		_____3________
	       /              \
	    ___5__          ___1__
	   /      \        /      \
	   6      _2       0       8
	         /  \
	         7   4
	 */
		TreeNode t3 = new TreeNode(3);
		
		TreeNode t5 = new TreeNode(5);
		TreeNode t1 = new TreeNode(1);
		
		TreeNode t6 = new TreeNode(6);
		TreeNode t2 = new TreeNode(2);
		TreeNode t0 = new TreeNode(0);
		TreeNode t8 = new TreeNode(8);
		
		t2.left = new TreeNode(7);
		t2.right = new TreeNode(4);
		t5.left = t6;
		t5.right = t2;
		t1.left = t0;
		t1.right = t8;
		
		t3.left = t5;
		t3.right = t1;
		
		TreeNode r = LowestCommonAncestor.lowestCommonAncestor(t3, t1.left, t1.right);
		assertEquals(t1, r);
		
	}
	
	@Test
	public void testLowestCommonAncestor_PassingRootNode1() {
	/*		_____3________
	       /              \
	    ___5__          ___1__
	   /      \        /      \
	   6      _2       0       8
	         /  \
	         7   4
	 */
		TreeNode t3 = new TreeNode(3);
		
		TreeNode t5 = new TreeNode(5);
		TreeNode t1 = new TreeNode(1);
		
		TreeNode t6 = new TreeNode(6);
		TreeNode t2 = new TreeNode(2);
		TreeNode t0 = new TreeNode(0);
		TreeNode t8 = new TreeNode(8);
		
		t2.left = new TreeNode(7);
		t2.right = new TreeNode(4);
		t5.left = t6;
		t5.right = t2;
		t1.left = t0;
		t1.right = t8;
		
		t3.left = t5;
		t3.right = t1;
		
		TreeNode r = LowestCommonAncestor.lowestCommonAncestor(t3, t2.left, t3);
		assertEquals(t3, r);
		
	}

}
