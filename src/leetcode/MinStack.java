/**
 * 
 */
package leetcode;

import java.util.Stack;

/**
 * @author Jay Patel
 *
 */
public class MinStack {

	
	Stack<Integer> mainstack;
	Stack<Integer> secondaryminstack;
	
	
	/** initialize your data structure here. */
    public MinStack() {
        mainstack = new Stack<Integer>();
        secondaryminstack = new Stack<Integer>();
    }
    
    public void push(int x) {
        mainstack.push(x);
        if(secondaryminstack.isEmpty()) {
        	secondaryminstack.push(x);
        }else{
        	if(x < secondaryminstack.peek()) {
        		secondaryminstack.push(x);
        	} else{
        		secondaryminstack.push(secondaryminstack.peek()); // continue previous 
         	}
        }
    }
    
    public void pop() {
        mainstack.pop();
        secondaryminstack.pop();
    }
    
    public int top() {
    	return mainstack.peek();   
    }
    
    public int getMin() {
		return secondaryminstack.peek();
       
    }
    
}
