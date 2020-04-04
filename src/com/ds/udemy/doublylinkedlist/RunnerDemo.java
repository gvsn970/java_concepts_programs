package com.ds.udemy.doublylinkedlist;

public class RunnerDemo {

	public static void main(String[] args) {
		DoubleLinkedList  dl=new DoubleLinkedList();
		/*dl.insertionEmptyListAdd(11);
		dl.insertBeginning(10);
		dl.insertBeginning(9);
		dl.insertElementLastNode(12);
		dl.lastNodeDelete();*/
		dl.addElement(3);
		dl.addLastNode(4);
		dl.addLastNode(5);
		dl.addLastNode(6);
		dl.afterNode(55, 6);
		dl.display();
		System.out.println();
		dl.reverseDoubleLinkedList();
	
	}
}
