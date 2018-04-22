package leetcode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import models.TreeNode;

public class PathSum2Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPathSum() {
		/*
		 * 			  5
				     / \
				    4   8
				   /   / \
				  11  13  4
				 /  \    / \
				7    2  5   1
		
		 * 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1
		 * 
		 * */
		TreeNode t5 = new TreeNode(5);
		TreeNode t4 = new TreeNode(4);
		TreeNode t8 = new TreeNode(8);
		TreeNode t11 = new TreeNode(11);
		TreeNode t13 = new TreeNode(13);
		TreeNode t4_2 = new TreeNode(4);
		
		t11.left = new TreeNode(7);
		t11.right = new TreeNode(2);
		t4_2.left = new TreeNode(5);
		t4_2.right = new TreeNode(1);
		
		t4.left = t11;
		t8.left = t13;
		t8.right = t4_2;
				
		t5.left = t4;
		t5.right = t8;
		
		//TreeUtils.printLevelOrder(t5);
		
		List<List<Integer>> res = PathSum2.pathSum(t5, 22);
		assertEquals(2, res.size());
		
	}
	
	@Test
	public void testPathSum_WithSingleNode() {
		
		TreeNode t = new TreeNode(5);
		List<List<Integer>> res = PathSum2.pathSum(t, 5);
		assertEquals(1, res.size());
		
		TreeNode t2 = new TreeNode(10);
		List<List<Integer>> res2 = PathSum2.pathSum(t2, 5);
		assertEquals(0, res2.size());
		
	}
	
	@Test
	public void testPathSum_WithNullNode(){
		assertEquals(0 , PathSum2.pathSum(null, 10).size());
	}

}
