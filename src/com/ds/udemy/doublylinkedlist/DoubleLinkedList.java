package com.ds.udemy.doublylinkedlist;

public class DoubleLinkedList {

	private Node start;

	DoubleLinkedList() {
		start = null;
	}

	public void insertBeginning(int data) {
		Node temp = new Node(data);
		if (start != null) {
			temp.nxt = start;
			start.prev = temp;
			start = temp;
		}

	}

	public void display() {
		Node p;
		if (start == null) {
			System.out.println("List Empty ..");
			return;
		}
		p = start;
		while (p != null) {
			System.out.println(p.info);
			p = p.nxt;
		}
	}

	public void insertionEmptyListAdd(int data) {
		Node temp = new Node(data);
		if (start == null) {
			start = temp;
			return;
		}
	}

	public void insertElementLastNode(int data) {
		if (start == null) {
			System.out.println("List is Empty ..");
			return;
		}
		Node p = start;
		Node temp = new Node(data);
		while (p.nxt != null) {
			p = p.nxt;
		}
		p.nxt = temp;
		temp.prev = p;
	}

	public void insertAfterNode(int data, int postion) {
		if (start == null) {
			System.out.println("List is Empty ..");
			return;
		}
		Node p = start;
		while (p != null) {
			if (p.info == postion)
				break;
			p = p.nxt;
		}

		Node temp = new Node(data);
		temp.prev = p;
		temp.nxt = p.nxt;
		if (p.nxt != null) {
			p.nxt.prev = temp;
		}

		p.nxt = temp;
	}

	public void insertBeforeNode(int data, int pos) {
		if (start == null) {
			System.out.println("List is Empty ..");
			return;
		}
		if (start.info == pos) {
			Node temp = new Node(data);
			temp.nxt = start;
			start.prev = temp;
			start = temp;
		}
		Node p = start;
		while (p != null) {
			if (p.info == pos)
				break;
			p = p.nxt;
		}
		Node temp = new Node(data);
		temp.prev = p.prev;
		temp.nxt = p;
		p.prev.nxt = temp;
		p.prev = temp;

	}

	public void deleteFirstNode() {
		if (start == null) {
			System.out.println("List is Empty ..");
			return;
		}
		if (start.nxt == null) {
			start = null;
			;
			return;
		}
		start = start.nxt;
		start.prev = null;

	}

	public void lastNodeDelete() {
		if (start == null) {
			System.out.println("List is Empty ..");
			return;
		}
		Node p = start;
		while (p.nxt != null) {
			p = p.nxt;
		}
		p.prev.nxt = null;

	}

	public void deleteparicularNode(int data) {
		if (start == null) {
			System.out.println("List is Empty ..");
			return;
		}
		if (start.info == data) {
			deleteFirstNode();
			return;
		}
		Node p = start;
		while (p != null) {
			if (p.info == data)
				break;
			p = p.nxt;
		}
		if (p.nxt != null) {
			p.prev.nxt = p.nxt;
			p.nxt.prev = p.prev;
		} else {
			p.prev.nxt = null;
		}

	}

	public void addElement(int data) {
		Node temp = new Node(data);
		if (start == null) {
			start = temp;
			return;
		} else {

			temp.nxt = start;
			start.prev = temp;
			start = temp;
		}
	}

	public void addLastNode(int data) {
		if (start == null) {
			System.out.println("List is Empty ..");
			return;
		}
		Node p = start;
		Node temp = new Node(data);
		while (p.nxt != null) {
			p = p.nxt;
		}
		p.nxt = temp;
		temp.prev = p;
	}

	public void afterNode(int data,int value) {
		if (start == null) {
			System.out.println("List is Empty ..");
			return;
		}
		Node p=start;
		Node temp=new Node(data);
		while(p !=null) {
			if(p.info == value) 
				break;
			p=p.nxt;
		}
		temp.prev=p;
		temp.nxt=p.nxt;
		
		if(p.nxt !=null) {
			p.nxt.prev=temp.nxt;
		}
		p.nxt=temp;
	}
	public void beforeNode(int data ,int value) {
		if (start == null) {
			System.out.println("List is Empty ..");
			return;
		}
		Node p=start;
		Node temp=new Node(data);
		while(p !=null) {
			if(p.info == value)
				break;
			p=p.nxt;
		}
		temp.prev=p.prev;
		temp.nxt=p;
		p.prev.nxt=temp;
		p.prev=temp;
		
	}
	public void reverseDoubleLinkedList() {

        Node last = null; 
      
        while (start != null) { 
           
            last = start; 
            start = start.nxt; 
        } 
        System.out.println(); 
        System.out.println("Traversal in reverse direction"); 
        while (last != null) { 
            System.out.print(last.info + " "); 
            last = last.prev; 
        }
	}

}
