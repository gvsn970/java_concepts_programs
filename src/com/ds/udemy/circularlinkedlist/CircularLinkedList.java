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
		Node temp=new Node(data);
		temp.link=last.link;
		last.link=temp;
	
	}

	public void insertEmptyList(int data) {

		if (last == null) {
			Node temp = new Node(data);
			last = temp;
			last.link = last;
			return;
		}
	
	}

	public void insertLastNode(int data) {
		if (last == null) {
			System.out.println("List Is Empty ..");
			return;
		}
		Node temp=new Node(data);
		temp.link=last.link;
		last.link=temp;
		last=temp;
	}
	public void afterNode(int data ,int value) {
		if (last == null) {
			System.out.println("List Is Empty ..");
			return;
		}
		Node p=last.link;
		Node temp=new Node(data);
		while(p !=null) {
			if(p.info == value)
				break;
			p=p.link;
		}
		temp.link = p.link;
		p.link = temp;

	}
	public void beforeNode(int data,int value) {
		if (last == null) {
			System.out.println("List Is Empty ..");
			return;
		}
		Node p=last.link;
		Node temp=new Node(data);
		if(last.info == value) {
			temp.link=last;
			last=temp;
			return ;
		}
		while(p !=null) {
			if(p.link.info == value)
				break;
			p=p.link;
		}
		temp.link=p.link;
		p.link=temp;
	}

	public void deleteFirstNode() {
		if (last == null) {
			System.out.println("List Is Empty ..");
			return;
		}
		if (last.link == last) {
			last = null;
			return;
		}
		last.link = last.link.link;
	}

	public void deleteLastNode() {
		if (last == null) {
			System.out.println("List Is Empty ..");
			return;
		}
		if (last.link == last) {
			last = null;
			return;
		}
		Node p = last;
		p.link = last.link.link;
		last = p;
	}
}
