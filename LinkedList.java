package linkedlist;

public class LinkedList {
	
	private Node head = null;
	private int length = 0;
	private Node tail = this.head;
  
	public boolean isEmpty() {
		if (this.head == null)
			return true; 
		return false;
	}//end isEmpty
  
	public Node getList() {
	  
		return this.head;
	}//end getList
  
	public void addNode(Node aNode) {
	  
		if (isEmpty()) {
			this.head = aNode;
			this.tail = this.head;
			return;
		}//end if-statement
    
		this.tail.setNextNode(aNode);
		this.tail = this.tail.getNextNode();
		this.tail.setNextNode(null);
		this.length++;
    	}//end addNode
  
}//end class
