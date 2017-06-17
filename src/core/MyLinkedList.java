/**
 * 
 */
package core;

import data.structres.sll.LLNode;

/**
 * @author Jay Patel
 *
 */
public class MyLinkedList<E> {
	
	private LLNode<E> head;
	private LLNode<E> tail;
	private int listSize;
	
	public MyLinkedList() {
		head = null;
		tail = null;
		listSize = 0;
	}
	
	public int size(){
		return listSize;
	}
	
	public boolean isEmpty(){
		if(head == null) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return head.toString();
	}
	
	public void add(E nodeData) {
		if(this.isEmpty()){
			head = new LLNode<E>(nodeData);
			tail = head;
			
		}
		else {
			LLNode<E> new_tail = new LLNode<E>(nodeData);
			tail.nextNode = new_tail;
			tail = tail.nextNode;
		}
		listSize++;
	}

	public void addFirst(E data) {
		if(!this.isEmpty()){
			LLNode<E> newHead = new LLNode<E>(data);
			newHead.nextNode = head;
			head = newHead;
		}else{
			throw new IllegalStateException("List is empty. No elements to add to the head");
		}
	}
	
	
	
}
