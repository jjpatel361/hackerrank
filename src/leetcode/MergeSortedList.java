/**
 * 
 */
package leetcode;

import models.ListNode;

/**
 * @author Jay Patel
 *
 */
public class MergeSortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode(6);
		ListNode currentHead = head;
		
		currentHead.next = new ListNode(3);
		currentHead = currentHead.next;
		System.out.println(head);
		
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
			
			ListNode fakeHead = new ListNode(0);
			ListNode currentNode = fakeHead;
			
			while(true) {
				// both pointers are null 
				if(l1 == null && l2 == null) {
					break;
				}
				// if l1 is null and l2 still has nodes
				if(l1 == null && l2 != null ) {
					currentNode.next = l2;
					break;
				}
				
				if(l1 != null && l2 == null) {
					currentNode.next = l1;
					break;
				}
				
				// both pointers have values in them
				if(l1.val < l2.val) {
					currentNode.next = new ListNode(l1.val);
					l1 = l1.next; // move fwd l1 
					currentNode = currentNode.next; // move fwd res
					continue; // restart 
				}
 				
				if(l2.val < l1.val) {
					currentNode.next = new ListNode(l2.val);
					l2 = l2.next;
					currentNode = currentNode.next;
					continue;
				}
				
				if(l1.val == l2.val) {
					// add it twice
					currentNode.next = new ListNode(l1.val);
					currentNode.next.next = new ListNode(l1.val);
					
					// move both forward
					l1 = l1.next;
					l2 = l2.next;
					
					currentNode = currentNode.next;
					currentNode = currentNode.next;
					continue;
				}
				
			}
		
			return fakeHead.next;
	}

}
