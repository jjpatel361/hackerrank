package core;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyLinkedListStack {

	LinkedList<String> _internalLinkedList ;
	
	public MyLinkedListStack() {
		_internalLinkedList = new LinkedList<>();
		
	}

	public void push(String val) {
		_internalLinkedList.addFirst(val);
		
	}

	public String pop() {
		if(_internalLinkedList.isEmpty()){
			throw new EmptyStackException();
		}else {
			return _internalLinkedList.getFirst();
		}
		
	}

}
