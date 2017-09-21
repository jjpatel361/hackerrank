package leetcode;

import org.junit.*;
import models.MyQueue;

public class QueueUsingStack {

	public static void main(String[] args) {
	
		MyQueue q = new MyQueue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		
		Assert.assertEquals("Fail ", 1, q.peek());
		Assert.assertEquals("Fail ", 1, q.pop());
		Assert.assertEquals("Fail ", 2, q.peek());
		Assert.assertEquals("Fail ", 2, q.pop());
		Assert.assertEquals("Fail ", 3, q.pop());
		
	}

}
