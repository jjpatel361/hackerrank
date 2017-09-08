package data.structres.sll;

import core.MyLinkedListStack;

public class StackUsingLinkedList {

	
	
	public static void main(String[] args) {
		
		MyLinkedListStack s = new MyLinkedListStack();
		
		s.push("10");
		s.push("19");
		s.push("20");
		
		String last_val = s.pop();
		System.out.println(last_val);
		
	}

}
