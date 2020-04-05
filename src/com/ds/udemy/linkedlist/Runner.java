package com.ds.udemy.linkedlist;

public class Runner {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		// l.beggingAtStart(55);
		// l.insertElementAtEnd(110);
		// l.insertElementAtEnd(5);
		// l.insertElementAtEnd(20);
		// l.display();

		// System.out.println();
		// l.insertAfterNode(16,15);

		// l.display();
		// System.out.println();
		// l.insertElementBefore(9, 10);
		// l.atpostion(45, 2);
		// l.deleteFirstNode();
		// l.deleteOnlyNode();
		// l.reverseSingleLinkedList();;
		// l.sortingBubboleSort();
/*		l.addedFirstNode(3);
		l.addedElement(4);
		l.addedElement(5);
		l.addedElement(6);
		l.addedElement(7);
		l.addedElement(8);*/
		
		//l.beforeNode(60, 5);
		//l.deleteNodeParticlar(8);
		l.insertOrder(55);
		l.insertOrder(20);
		l.insertOrder(5);
		l.insertOrder(15);
		l.insertOrder(10);
		
		l.display();
		
		l.search(556);
	}
}
