package data.structres.sll;

import java.io.IOException;
import java.util.ArrayList;

import data.utils.DataUtil;

public class SingleLinkedList {

	public static void main(String[] args) throws IOException {
		DataUtil util = new DataUtil();
		
		ArrayList<Integer> data = util.readFile("./data/singlelinkedlist.txt");
		
		
		Node head = createSingleLinkedList(data);
		
		// INSERT AT THE END
		Node lastNode = new Node();
		lastNode.val = 99;
		Node newHead = insertNodeToEnd(head, lastNode);
		
		System.out.println(newHead);
		
	}
	
	private static Node insertNodeToEnd(Node head, Node lastNode) {
		
		Node currentNode = head; 
		
		// Travel to last element
		while(currentNode.next != null){
			currentNode = currentNode.next;
		}
		
		//Save next node
		lastNode.next = currentNode.next;
		currentNode.next = lastNode;
		
		return head;
		
	}

	public static Node createSingleLinkedList(ArrayList<Integer> data){
		Node currentNode = null;
		
		for (int i = data.size()-1; i >= 0; i--) {
			
			int nextval = data.get(i);
			
			Node node = new Node();
			node.val = nextval;
			
			node.next = currentNode;
			
			currentNode = node;
		}
		
		return currentNode;
	}

	public Node mergeLinkedList(Node headA, Node headB) {
		
		//Select headNode with minimum value
		Node sllNode = new Node();
		
		
		Node currentA = headA;
		Node currentB = headB;
		
		// headA = 0
		// headB = 0
		// headA < headB
		// headB < headA
		
		//Before starting set sllNode to the min Head
		if(currentA != null && currentB != null){
			if(currentA.val <= currentB.val){
				if(currentA.val == 0){
					//Don't make 0 as head
					sllNode = new Node();
					sllNode.val = currentB.val;
					currentB = currentB.next;	
				}else{
					sllNode = new Node();
					sllNode.val = currentA.val;
					
				}
				currentA = currentA.next;
			}else{
				if(currentB.val == 0){
					//Don't make 0 as head 
					// make head of other chain
					//sllNode = new SLLNode(currentA.val);
					sllNode.val = currentA.val;
					currentA = currentA.next;	
				}else{
					sllNode = new Node();
					sllNode.val = currentB.val;
				}
				currentB = currentB.next;
			}
		}else if(currentA == null && currentB == null){
			//Put B into sllNode
			return null;
			
		}else if(currentA == null ){
			//Put A into sllNode
			return currentB;
		}else if(currentB == null) {
			return currentA;
		}
		
		Node result = sllNode;
		
		//Loop assuming headA has maximum length
		while(currentA != null){
			int a = currentA.val;
			if(currentB != null){
				int b = currentB.val;
				if(a < b){
					sllNode.next = new Node();
					sllNode.next.val = currentA.val;
					currentA = currentA.next;
				}else{
					sllNode.next = new Node();
					sllNode.next.val = currentB.val;
					currentB = currentB.next;
				}
				
			}else{
				// Add all elements of currentA 
				sllNode.next = new Node();
				sllNode.next.val = currentA.val;
				currentA = currentA.next;
				
			}
			sllNode = sllNode.next;
		}
		
		while(currentB != null){
			sllNode.next = currentB;
			sllNode = sllNode.next;
			currentB = currentB.next;
		}
		return result;
	}

	public static int getNode(Node sl, int i) {
		//traverse complete list can count number of elements.
		int count = 0;
		Node dl = sl;
		while(sl != null){
			sl = sl.next;
			count++;
		}
		
		while(count -1 != i){
			count--;
			dl = dl.next;
			
		}
		
		return dl.val;
	}

	public Node removeDuplicates(Node head) {
		
		Node primary = head;
		// check is head node is not null
		Node auxiliary = head.next;
		Node result = primary;
		while(auxiliary != null){
			int pval = primary.val;
			int sval = auxiliary.val;
			if(pval == sval){
				primary.next = auxiliary.next;
			}else{
				primary = primary.next;
			}
			auxiliary = auxiliary.next;
		}
		return result;
	}
	
	
	
}
