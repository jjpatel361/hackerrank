/**
 * 
 */
package leetcode;

import models.ListNode;

/**
 * @author Jay Patel
 *
 */
public class ReverseLinkedList {

	public static ListNode reverseList(ListNode head) {
		
		ListNode currentNode = head;
		ListNode prevNode = null;
		
		while(currentNode != null) {
			ListNode nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		
		return prevNode;
	}
}
