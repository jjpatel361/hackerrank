package leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import models.TreeNode;

public class IsSubtreeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsSubtree() {
		/*
		 * 
		 *  	 3
			    / \
			   4   5
			  / \
			 1   2
		 * 
		 * 
		 * */
		
		TreeNode root = new TreeNode(3);
		TreeNode l1 = new TreeNode(4);
		TreeNode l2 = new TreeNode(5);
		
		l1.left = new TreeNode(1);
		l1.right = new TreeNode(2);
		
		root.left = l1;
		root.right = l2;
		
		assertTrue(IsSubtree.isSubtree(root, l1));
		
	}

}
