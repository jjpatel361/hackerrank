package demo;

import core.MyLinkedList;

public class TestLinkedList {

	
	public static <AnyType> void main(String[] args) {
		
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("67");
		list.add("56");
		list.add("77");
		list.addFirst("10");
		System.out.println(list.toString());
	}
}
