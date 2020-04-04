package com.ds.udemy.circularlinkedlist;

public class RunnerDemo {

	public static void main(String[] args) {
		
		CircularLinkedList cl=new CircularLinkedList();
		cl.insertEmptyList(5);
		cl.insertLastNode(15);
		cl.insertLastNode(20);
		cl.insertElementBeginning(10);
		cl.deleteLastNode();
		cl.display();
	}
}
