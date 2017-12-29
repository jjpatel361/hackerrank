/**
 * 
 */
package leetcode;

import java.util.Stack;

import models.ListNode;

/**
 * @author Jay Patel
 *
 */
public class AddTwoNumbers {

	/**
	 * @param https://leetcode.com/problems/add-two-numbers-ii/description/
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// Make l1
		ListNode ll_4 = new ListNode(3, null);
		ListNode ll_3 = new ListNode(4, ll_4);
		ListNode ll_2 = new ListNode(2, ll_3);
		ListNode ll_1 = new ListNode(7, ll_2);
		
		
		// Make l2
		ListNode pp_3 = new ListNode(4, null);
		ListNode pp_2 = new ListNode(6, pp_3);
		ListNode pp_1 = new ListNode(5, pp_2);
		
		ListNode d = addTwoNumbers2(ll_1, pp_1);
			
	}
	
	 public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		
		 // store main reference
		 ListNode ref_l1 = l1;
		 ListNode ref_l2 = l2;
				
		 
		 // find the length of bigger LL
		 int l1_length = 0;
		 int l2_length = 0;
		 
		 while(l1 != null || l2 != null) {
			 if(l1 != null) {
				 l1 = l1.next;
				 l1_length += 1;
			 }

			 if(l2 != null) {
				 l2 = l2.next;
				 l2_length += 1;
			 }
		 }
		 
		 //System.out.println("Length of L1 : " + l1_length);
		 //System.out.println("Length of L2 : " + l2_length);
		 
		 
		 ListNode largerList,smallerList;
		 
		 if(l1_length >= l2_length) {
			 largerList = ref_l1;
			 smallerList = ref_l2;
		 }else {
			 largerList = ref_l2;
			 smallerList = ref_l1;
		 }
		 
		 int padding_required = Math.abs(l2_length-l1_length);
		 
		 
		 while(padding_required > 0) {
			 ListNode dummyNode = new ListNode(0);
			 dummyNode.next = smallerList;
			 smallerList = dummyNode;
			 padding_required--;
		 }
		 
		 //System.out.println(smallerList);
		 
		 
		 // Loop through the list and add sum to stack
		 Stack<Integer> sumStack = new Stack<Integer>();
		 while(smallerList != null) {
			 int sum = smallerList.val + largerList.val;
			 sumStack.push(sum);
			 smallerList = smallerList.next;
			 largerList = largerList.next;
		 }
		 
		 int carry = 0;
		 ListNode result = new ListNode(0);
		 while(!sumStack.isEmpty()) {
			 int currentsum = sumStack.pop() + carry;
			 carry = currentsum >= 10 ? 1 : 0;
			 result.val = currentsum%10;
			 ListNode p = new ListNode(0);
			 p.next = result;
			 result = p;
		 }
		 
		 // take care for residual carry
		 if(carry == 1) {
			 result.val = 1;
			 return result;
		 }
		 
		 return result.next;
	
	 }
	 
	 

}
