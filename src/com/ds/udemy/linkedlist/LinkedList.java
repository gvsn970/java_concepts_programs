package com.ds.udemy.linkedlist;

public class LinkedList {

	private Node start;

	public void beggingAtStart(int data) {
		Node temp = new Node(data);
		if (start == null) {
			start = temp;
		} else {
			temp.link = start;
			start = temp;
		}

	}

	public void display() {
		Node p = start;
		if (start == null) {
			System.out.println("Empty List :");
			return;
		}
		while (p != null) {
			System.out.println(p.info + " ");
			p = p.link;
		}
	}

	public void insertElementAtEnd(int data) {
		Node temp = new Node(data);
		Node p = start;
		if (start == null) {
			start = temp;
			return;
		}

		while (p.link != null) {
			p = p.link;
		}
		p.link = temp;
	}

	public void insertAfterNode(int data, int value) {
		Node p = start;
		if (p == null) {
			System.out.println(" Value Not Found");
			return;
		}
		Node temp = new Node(data);
		while (p.link != null) {
			if (p.info == value) {
				break;
			}
			p = p.link;
		}
		temp.link = p.link;
		p.link = temp;

	}

	public void insertElementBefore(int data, int value) {
		Node p = start;
		if (start == null) {
			System.out.println("List Is Empty :");
			return;
		}
		if (start.info == value) {
			Node temp = new Node(data);
			temp.link = start;
			start = temp;
			return;
		}
		while (p.link != null) {
			if (p.link.info == value)
				break;
			p = p.link;
		}
		Node temp = new Node(data);
		temp.link = p.link;
		p.link = temp;

	}

	public void atpostion(int data, int value) {
		Node p = start;
		for (int i = 1; i < value && p.link != null; i++) {
			p = p.link;
		}
		Node temp = new Node(data);
		temp.link = p.link;
		p.link = temp;
	}

	public void deleteFirstNode() {
		if (start == null) {
			System.out.println("Empty List");
			return;
		}
		start = start.link;
	}

	public void deleteOnlyNode() {
		start = null;
	}

	public void deleteNode(int value) {
		if (start == null) {
			System.out.println("Empty List");
			return;
		}
		Node p = start;
		while (p.link != null) {
			if (p.link.info == value)
				break;
			p = p.link;
		}
		p.link = p.link.link;
	}

	public void deleteLastNode() {
		if (start == null) {
			System.out.println("Empty List");
			return;
		}
		if (start.link == null) {
			start = null;
			return;
		}
		Node p = start;
		while (p.link.link != null) {
			p = p.link;
		}
		p.link = null;
	}

	public void reverseSingleLinkedList() {
		Node p, nxt, prev = null;
		p = start;
		while (p != null) {
			nxt = p.link;
			p.link = prev;
			prev = p;
			p = nxt;
		}
		start = prev;
	}

	public void sortingBubboleSort() {
		Node p = null, q, end;
		for (end = null; end != start.link; end = p) {
			for (p = start; p.link != end; p = p.link) {
				q=p.link;
				if(p.info>q.info) {
					int temp=p.info;
					p.info=q.info;
					q.info=temp;
				}
			}
		}
	}

}
