package data.structres.sll;

import java.io.IOException;
import java.util.ArrayList;

import data.utils.DataUtil;

public class DeleteDuplicateNode {

	public static void main(String[] args) throws IOException {
		DataUtil util = new DataUtil();
		
		ArrayList<Integer> data = util.readFile("./data/delete_duplicate.txt");
		
		SingleLinkedList sll = new SingleLinkedList();
		
		Node head = SingleLinkedList.createSingleLinkedList(data);
		
		Node result = sll.removeDuplicates(head);
		
		System.out.println(result.toString());
	}

}
