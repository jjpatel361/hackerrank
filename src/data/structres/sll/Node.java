package data.structres.sll;

public class Node {
	
	int val;
	Node next;
	
	
	public Node(){}
	
	public Node(int value, Node nextNode) {
		this.val = value;
		this.next = nextNode;
	}
	
	@Override
	public String toString(){
		return this.val + " ==> " +(this.next == null ? "  end" : this.next.toString());
	}

}
