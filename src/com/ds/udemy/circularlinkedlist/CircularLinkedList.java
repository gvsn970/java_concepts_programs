package com.ds.udemy.circularlinkedlist;

public class CircularLinkedList {

	private Node last;

	CircularLinkedList() {
		last = null;
	}

	public void display() {
		Node p;
		if (last == null) {
			System.out.println("List Is Empty ..");
			return;
		}
		p = last.link;
		do {
			System.out.println(p.info);
			p = p.link;
		} while (p != last.link);
		System.out.println();

	}

	public void insertElementBeginning(int data) {
		if (last == null) {
			System.out.println("List Is Empty ..");
			return;
		}
		Node temp = new Node(data);
		temp.link = last.link;
		last.link = temp;
	}

	public void insertEmptyList(int data) {

		Node temp = new Node(data);
		last = temp;
		last.link = last;

	}

	public void insertLastNode(int data) {
		if (last == null) {
			System.out.println("List Is Empty ..");
			return;
		}
		Node temp = new Node(data);
		temp.link = last.link;
		last.link = temp;
		last = temp;
	}
	public void deleteFirstNode() {
		if (last == null) {
			System.out.println("List Is Empty ..");
			return;
		}
		if(last.link ==last) {
			last=null;
			return ;
		}
		last.link=last.link.link;
	}
	public void deleteLastNode() {
		if (last == null) {
			System.out.println("List Is Empty ..");
			return;
		}
		if(last.link ==last) {
			last=null;
			return ;
		}
		Node p=last;
		p.link=last.link.link;
		last=p;
	}
}
