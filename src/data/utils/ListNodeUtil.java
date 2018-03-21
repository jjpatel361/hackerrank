package data.utils;

import models.ListNode;

public class ListNodeUtil {
	
	public static ListNode fillWithArray(int[] data) {
		
		ListNode head = new ListNode(0);
		ListNode currentNode = head;
		for (int i : data) {
			currentNode.next = new ListNode(i);
			currentNode = currentNode.next;
		}
		return head.next;
	} 

}
