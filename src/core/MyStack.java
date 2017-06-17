/**
 * 
 */
package core;

/**
 * @author Jay Patel
 * 
 */
public class MyStack<E> {
	
	private E[] _stack;
	private int currentIndex;
	private int size;
	
	@SuppressWarnings("unchecked")
	public MyStack() {
		_stack = (E[]) new Object[100];
		currentIndex = -1;
	}
	
	public void push(E data){
		currentIndex++;
		_stack[currentIndex] = data;
		size++;
	}
	
	public E pop() throws IllegalAccessException{
		if(this.isEmpty()){
			throw new IllegalAccessException("Empty Stack");
		}
		size--;
		E topElement = _stack[currentIndex];
		currentIndex -- ;
		return topElement;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	

}
