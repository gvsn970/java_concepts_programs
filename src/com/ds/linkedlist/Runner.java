package com.ds.linkedlist;

public class Runner {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.insert(5);
		l.insert(50);
		l.insert(56);
		l.insertAtStart(44);
	//	l.insertAtPostion(1, 123);
		l.show();
	//	l.deleteAt(3);
		l.reverseLinkedList();
		System.out.println();
		l.show();
	}
}
