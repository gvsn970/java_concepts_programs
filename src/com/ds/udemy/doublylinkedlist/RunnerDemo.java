package com.ds.udemy.doublylinkedlist;

public class RunnerDemo {

	public static void main(String[] args) {
		DoubleLinkedList  dl=new DoubleLinkedList();
		dl.insertionEmptyListAdd(5);
		dl.insertBeginning(10);
		dl.insertBeginning(15);
		dl.display();
		System.out.println();
		dl.insertElementLastNode(20);
		dl.display();
	}
}
