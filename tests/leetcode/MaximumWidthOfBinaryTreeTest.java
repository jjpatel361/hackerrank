package leetcode;

import static org.junit.Assert.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import helpers.TreeUtils;
import models.TreeNode;

public class MaximumWidthOfBinaryTreeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWidthOfBinaryTree() {
		/**
				  1
		         / \
		        3   2
		       /     \  
		      5       9 
		     /         \
		    6           7 	
		 * */	
		TreeNode t = new TreeNode(1);
		
		TreeNode t3 = new TreeNode(3);
		TreeNode t2 = new TreeNode(2);
		
		TreeNode t5 = new TreeNode(5);
		TreeNode t9 = new TreeNode(9);
		
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		
		t5.left = t6;
		t3.left = t5;
		t.left = t3;
		
		t9.right = t7;
		t2.right = t9;
		t.right = t2;
		
		TreeUtils.printLevelOrder(t);
		assertEquals(8, MaximumWidthOfBinaryTree.widthOfBinaryTree(t));		
	}
	
	@Test
	public void testWidthOfBinaryTree_2() {
	/*
	 *    1
	     /  
	    3    
	   / \       
	  5   3     
	 * 
	 * 
	 * */
		TreeNode t1 = new TreeNode(1);

		TreeNode t3 = new TreeNode(3);
		t3.left = new TreeNode(5);
		t3.right = new TreeNode(3);
		
		t1.left = t3;
		
		TreeUtils.printLevelOrder(t1);
		assertEquals(2, MaximumWidthOfBinaryTree.widthOfBinaryTree(t1));
		
	}
	
	@Test
	public void testLengthQueue(){
		Deque<TreeNode> q = new LinkedList<TreeNode>();
		q.add(null);
		q.add(new TreeNode(1));
		q.add(null);
		q.add(new TreeNode(3));
		assertEquals( 3 , MaximumWidthOfBinaryTree.length(q));
	}
	
	@Test
	public void testLengthQueue_2(){
		Deque<TreeNode> q = new LinkedList<TreeNode>();
		q.add(null);
		q.add(null);
		q.add(null);
		q.add(null);
		assertEquals( 0 , MaximumWidthOfBinaryTree.length(q));
	}
	
	@Ignore
	public void test_SingleElementTree(){
		TreeNode t = new TreeNode(1);
		assertEquals(1, MaximumWidthOfBinaryTree.widthOfBinaryTree(t));
	}
	
	
	

}
