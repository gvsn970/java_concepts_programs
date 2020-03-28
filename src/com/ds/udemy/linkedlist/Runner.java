package com.ds.udemy.linkedlist;

public class Runner {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.beggingAtStart(55);
		l.insertElementAtEnd(110);
		l.insertElementAtEnd(5);
		l.insertElementAtEnd(20);
		l.display();
	
		//System.out.println();
		//l.insertAfterNode(16,15);
		
		//l.display();
		System.out.println();
		//l.insertElementBefore(9, 10);
		//l.atpostion(45, 2);
	//	l.deleteFirstNode();
	//	l.deleteOnlyNode();
	//	l.reverseSingleLinkedList();;
		l.sortingBubboleSort();
		l.display();
	}
}
