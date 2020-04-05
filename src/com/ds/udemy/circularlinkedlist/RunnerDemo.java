package com.ds.udemy.circularlinkedlist;

public class RunnerDemo {

	public static void main(String[] args) {
		
		CircularLinkedList cl=new CircularLinkedList();
		cl.insertEmptyList(5);
		cl.insertLastNode(10);
		cl.insertLastNode(15);
		cl.beforeNode(11, 5);
		cl.display();
	}
}
