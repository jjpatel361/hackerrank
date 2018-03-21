package leetcode;

import data.utils.ListNodeUtil;
import models.ListNode;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		
		ListNode l = ListNodeUtil.fillWithArray(new int[]{12, 12, 23, 23, 23, 45, 56});
		System.out.println(l);
		ListNode p = deleteDuplicates(l);
		System.out.println(p.toString());
		
	}

	public static ListNode deleteDuplicates(ListNode head) {
		
		ListNode c = head;
		ListNode n = c.next;
		ListNode r = c;
		while(n != null){
			if(c.val == n.val){
				c.next = n.next;
				n =  n.next;
			}else {
				c = n;
				n = n.next;
			}
		}
		return r;
	}

}
