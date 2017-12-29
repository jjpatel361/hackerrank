package leetcode;

import models.ListNode;

public class SwapNodesInPairs {
	
	
	/*
	 * description https://leetcode.com/problems/swap-nodes-in-pairs/description/
	 * 1->2->3->4
	 * 2->1->4->3
	 * 
	 * */
	public static void main(String[] args) {
		
		ListNode n4 = new ListNode(4);
		ListNode n3 = new ListNode(3 , n4);
		ListNode n2 = new ListNode(2 , n3);
		ListNode n1 = new ListNode(1 , n2);

		ListNode swapped = swapPairs(n1);
		System.out.println(swapped);

		
	}

	
	public static ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}	
		
		ListNode n = head.next;
		head.next = swapPairs(head.next.next);
		
		n.next = head;
		return n;
    }
}
