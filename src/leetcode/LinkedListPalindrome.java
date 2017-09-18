package leetcode;

import models.ListNode;

public class LinkedListPalindrome {

	public static void main(String[] args) {
		
		// 1 -> 2 -> 4 -> 5 -> null
		
		// Even sized list
		/*ListNode t4 = new ListNode(1, null);
		ListNode t3 = new ListNode(2, t4);
		ListNode t2 = new ListNode(2, t3);
		ListNode head = new ListNode(1, t2);*/
		
		/* Odd Sized List*/
		
		/*ListNode t5 = new ListNode(1, null);
		ListNode t4 = new ListNode(2, t5);
		ListNode t3 = new ListNode(3, t4);
		ListNode t2 = new ListNode(2, t3);
		ListNode head = new ListNode(1, t2);*/
		
		/*Only two nodes*/
		ListNode t1 = new ListNode(2, null);
		ListNode head = new ListNode(2, t1);
		boolean result = isPalindrome(head);
		
		//ListNode r = reverseLL(head);
		
		System.out.println(result);
		
	}
	
	public static boolean isPalindrome(ListNode head) {
		
		// Edge cases
		if(head == null || head.next == null) {
			return true;
		}
		
		ListNode slowpointer = head;
		ListNode fakehead = slowpointer;
		ListNode fastpointer = head;
		ListNode startsecond = null;
		while (fastpointer != null) {
			fastpointer = fastpointer.next.next;
			//
			if(fastpointer == null) {
				// linked list is even length
				startsecond = slowpointer.next;
				break;
			}
			
			if(fastpointer.next == null) {
				// linked list is odd length
				startsecond = slowpointer.next.next;
				break;
			}
			slowpointer = slowpointer.next;
		}
		
		slowpointer.next = null;
		
		ListNode matcher = reverseLL(startsecond);
		
		boolean ans = true;
		while(fakehead != null) {
			if (fakehead.val != matcher.val) {
				ans = false;
				break;
			}
			fakehead = fakehead.next;
			matcher = matcher.next;
		}
		return ans;
	}

	public static ListNode reverseLL(ListNode head) {
		
		ListNode currentNode = head;
		ListNode prevNode = null;
		ListNode nextNode = null;
		
		while(currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		
		return prevNode;
	}	
}
