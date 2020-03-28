package com.ds.udemy.doublylinkedlist;

public class RunnerDemo {

	public static void main(String[] args) {
		DoubleLinkedList  dl=new DoubleLinkedList();
		dl.insertionEmptyListAdd(5);
		dl.insertBeginning(10);
		dl.insertElementLastNode(15);
		dl.insertElementLastNode(20);
		dl.display();
		System.out.println();
		dl.insertBeforeNode(11,5);
		dl.display();
		System.out.println();
		dl.deleteparicularNode(20);
		dl.display();
	}
}
