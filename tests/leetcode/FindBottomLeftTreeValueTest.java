package leetcode;

import org.junit.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import models.TreeNode;

public class FindBottomLeftTreeValueTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindBottomLeftValue() {
/*
 * 	 2
   	/ \
   1   3
 * */
		TreeNode root = new TreeNode(2);
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(3);
		root.left = t1;
		root.right = t2;
		int actual = FindBottomLeftTreeValue.findBottomLeftValue(root);
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void testFindBottomLeftValue_test2() {
/*
 *      1
       / \
      2   3
     /   / \
    4   5   6
       /
      7
 * 
 * */
		TreeNode root = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		
		TreeNode t7 = new TreeNode(7);
		
		t5.left = t7;
		t3.left = t5;
		t3.right = t6;
		t2.left = t4;
		root.left = t2;
		root.right = t3;
		
		
		int actual = FindBottomLeftTreeValue.findBottomLeftValue(root);
		Assert.assertEquals(7, actual);
	}

}
