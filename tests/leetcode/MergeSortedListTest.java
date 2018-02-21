package leetcode;



import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import helpers.LinkedListUtil;

import models.ListNode;

public class MergeSortedListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	
	
	@Test
	public void testMergeTwoLists() {
		
		int[] data1 = new int[]{1,4,8};
		int[] data2 = new int[]{3,8};
		ListNode head = LinkedListUtil.createLinkedList(data1);
		ListNode head2 = LinkedListUtil.createLinkedList(data2);
		ListNode result = MergeSortedList.mergeTwoLists(head, head2);
		int[] result_arr =  LinkedListUtil.toArray(result);
		int[] expected_arr = new int[]{1,3,4,8,8};
		Assert.assertArrayEquals(expected_arr, result_arr);
		
	}

}
