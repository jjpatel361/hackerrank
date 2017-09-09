package linkedlist;

import org.omg.IOP.MultipleComponentProfileHelper;

public class ListNode {

	int val;
	ListNode next;
	ListNode(int x) {val =x;}
	
	
	public ListNode() {
		
	}
	
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
		/*ListNode thirdDigit = new ListNode(9);
		ListNode secondDigit = new ListNode(9, thirdDigit);
		ListNode firstDigit = new ListNode(9, secondDigit);
		ListNode number_1 = firstDigit;
		
		/*Number 2
		thirdDigit = new ListNode(9);
		secondDigit = new ListNode(9, thirdDigit);
		firstDigit = new ListNode(9, secondDigit);
		ListNode number_2 = firstDigit;*/
		
		ListNode thirdDigit = new ListNode(5);
		ListNode secondDigit = new ListNode(5, thirdDigit);
		
		ListNode result = addTwoNumbers(thirdDigit, secondDigit);
		
		System.out.println(result.toString());
		
	}


	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		
		
		return null;
	}


	/*private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// assuming both list are identical in size 
		int exp = 0;
		ListNode tmp = l1;
		
		// find len of the list and power required to raise
		while(tmp != null) {
			exp++;
			tmp = tmp.next;
		}
		 
				
		// put all sums in array
		int sum = 0;
		int[] result = new int[exp];
		ListNode n1 = l1;
		ListNode n2 = l2;
		
		while(exp > 0) {
			double multiplier = Math.pow(10, exp - 1);
			int factor = (int) multiplier;
			int q = n1.val * factor + n2.val * factor;
			sum += q;
			exp--;
			n1 = n1.next;
			n2 = n2.next;
		}
		
		// sum 
		int[] data = Integer.toString(sum).chars().map(c -> c-'0').toArray();
		ListNode n = new ListNode(data[data.length-1]); // last element
		ListNode h = n;
		for (int i = data.length -2; i >= 0 ; i--) {
			n.next = new ListNode(data[i]);
			n = n.next;
		}
		return h;
	}*/

	/*private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode r = null;
		
		if(l1.next != null && l2.next != null){
		
			ListNode p = addTwoNumbers(l1.next, l2.next);
			r = p; 
			// r is the last node in list hacky :( 
			while(r.next != null) {
				r = r.next;
			}
			
			int currentsum  = 0;
			
			int carry_forward = r.val;
			
			if(carry_forward > 10) {
				currentsum = 1 + l1.val+ l2.val;
				r.val = r.val % 10; // normalize carry forward
			}else if(carry_forward == 10) {
				currentsum = 1 + l1.val+ l2.val;
				r.val = r.val % 10; // normalize carry forward
			}else {
				currentsum = l1.val + l2.val;
			}
			ListNode t = new ListNode(currentsum);
			r.next = t;
			return p;
		
		}else {
			r = new ListNode(l1.val + l2.val); 
		}
		return r;
	}*/
	
	
	

}
