package linkedlist;

import org.omg.IOP.MultipleComponentProfileHelper;

public class ListNode {

	int val;
	ListNode next;
	ListNode(int x) {val =x;}
	
	public ListNode(int val, ListNode nextNode) {
		this.val = val;
		this.next = nextNode;
	}
	
	@Override
	public String toString() {
		return this.next != null ? this.val + " = " + this.next.toString() : this.val + "";
	}


	public static void main(String[] args) {
		/*Number 1*/
		ListNode thirdDigit = new ListNode(3);
		ListNode secondDigit = new ListNode(4, thirdDigit);
		ListNode firstDigit = new ListNode(2, secondDigit);
		ListNode number_1 = firstDigit;
		
		/*Number 2*/
		thirdDigit = new ListNode(4);
		secondDigit = new ListNode(6, thirdDigit);
		firstDigit = new ListNode(5, secondDigit);
		ListNode number_2 = firstDigit;
		
		ListNode result = addTwoNumbers(number_1, number_2);
		
		System.out.println(result.toString());
		
	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		
		ListNode head = new ListNode(0);
		
		ListNode tail = head;
		while(l1 != null  || l2 != null || carry != 0 ) {
			
			int vl1 = (l1 == null ) ? 0 : l1.val;
			int vl2 = (l2 == null) ? 0 : l2.val;
			
			int current_sum = vl1 + vl2 + carry;
			
			carry = 0;
			
			if(current_sum == 10) {
				carry = 1;
				current_sum = 0;
			}
			if(current_sum > 10) {
				carry = 1;
				current_sum = current_sum % 10;
			}

			tail.next = new ListNode(current_sum);
			
			tail = tail.next;
			
			l1 = (l1 == null) ? null : l1.next;
			l2 = (l2 == null) ? null : l2.next;
			
		}
		
		return head.next;
	}

}
