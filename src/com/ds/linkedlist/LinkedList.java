package com.ds.linkedlist;

import com.ds.linkedlist.Node1;

public class LinkedList {

	Node1 head;

	public void insert(int data) {
		Node1 node = new Node1();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node1 n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void show() {
		Node1 node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public void insertAtStart(int data) {
		Node1 node = new Node1();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAtPostion(int index, int data) {
		Node1 node = new Node1();
		node.data = data;
		node.next = null;
		if (index == 0) {
			insertAtStart(data);
		} else {
			Node1 n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}

	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node1 n = head;
			Node1 n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}

	public void reverseLinkedList() {
		Node1 n=head;
		Node1 prev=null,current=null;
		while(n!=null) {
			n=n.next;
			n.next=prev;
			prev=n;
			n=current;
		}
		head=prev;
	
	}
}
