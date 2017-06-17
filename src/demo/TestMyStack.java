package demo;

import core.MyStack;

public class TestMyStack {

	public static void main(String[] args) throws IllegalAccessException {
		
		MyStack<Integer> plates = new MyStack<Integer>();
		
		plates.push(34);
		plates.push(46);
		plates.push(78);
		plates.push(98);
		
		System.out.println(plates.getSize());
		System.out.println("Pop " + plates.pop());
		System.out.println("Pop " + plates.pop());
		System.out.println("Pop " + plates.pop());
		System.out.println("Pop " + plates.pop());

	}

}
