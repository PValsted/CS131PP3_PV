package main;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		//Testing String List
		GenericLinkedList myList=new GenericLinkedList();
		
		GenericNode<String> aNode=new GenericNode();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new GenericNode();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		GenericNode tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null); 
		
		
		//Testing Int List
		GenericLinkedList myIntList=new GenericLinkedList();
		
		GenericNode<Integer> intNode=new GenericNode();
		intNode.setData(4);
		myIntList.addNode(intNode);
		intNode = new GenericNode();
		intNode.setData(3948);
		myIntList.addNode(intNode);
		
		GenericNode tempintnode=myIntList.getList();
		do 
		{
			System.out.println(tempintnode.getData());
			tempintnode=tempintnode.getNextNode();
		} while (tempintnode!=null);
		
		
		//Testing Double List
		GenericLinkedList myDoubleList=new GenericLinkedList();
		
		GenericNode<Double> doubleNode=new GenericNode();
		doubleNode.setData(4.78);
		myDoubleList.addNode(doubleNode);
		doubleNode = new GenericNode();
		doubleNode.setData(45.98);
		myDoubleList.addNode(doubleNode);
		
		GenericNode tempDoubleNode=myDoubleList.getList();
		do 
		{
			System.out.println(tempDoubleNode.getData());
			tempDoubleNode=tempDoubleNode.getNextNode();
		} while (tempDoubleNode!=null);

	}//end main

}//end class
