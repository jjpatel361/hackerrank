package data.structres.sll;

import java.io.IOException;
import java.util.ArrayList;

import data.utils.DataUtil;

public class MergeLinkedList {
	
	public static void main(String[] args) throws IOException {
		DataUtil util = new DataUtil();
		ArrayList<Integer> data1 = util.readFile("./data/singlelinkedlist.txt");
		ArrayList<Integer> data2 = util.readFile("./data/singlelinkedlist2.txt");
		
		SingleLinkedList sll = new SingleLinkedList();
		
		Node headA = SingleLinkedList.createSingleLinkedList(data1);
		
		Node headB = SingleLinkedList.createSingleLinkedList(data2);
		
//		System.out.println(headA);
//		System.out.println(headB);
		
		Node mergedList = sll.mergeLinkedList(headA, headB);
		
		System.out.println(mergedList);
		
	}

}
