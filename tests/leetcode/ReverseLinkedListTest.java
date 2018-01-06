package leetcode;



import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import models.ListNode;

public class ReverseLinkedListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_BasicLinkedList_ShouldPass() {
		// Input 1=> 2=> 3
		// Output 3 => 2=> 1
		ListNode three = new ListNode(3);
		ListNode two = new ListNode(2, three);
		ListNode one = new ListNode(1, two);
		ListNode result = ReverseLinkedList.reverseList(one);
		Assert.assertEquals(3, result.val);
		Assert.assertEquals(2, result.next.val);
		Assert.assertEquals(1, result.next.next.val);
	}
	
	@Test
	public void test_NullLinkedList_ShouldReturnNull() {
		// Input 1=> 2=> 3
		// Output 3 => 2=> 1
		ListNode node = null;
		ListNode result = ReverseLinkedList.reverseList(node);
		Assert.assertNull(result);
	}
	
	@Test
	public void test_SingularLinkedList_ShouldReturnSameNode() {
		// Input 1=> 2=> 3
		// Output 3 => 2=> 1
		ListNode node = new ListNode(1);
		
		Assert.assertEquals(node.val, node.val);
	}

}
