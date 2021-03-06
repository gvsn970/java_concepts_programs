package com.ds.udemy.linkedlist;

public class LinkedList {

	private Node start;

	/*public void beggingAtStart(int data) {
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
*/
	public void addedFirstNode(int data) {
		Node temp=new Node(data);
		if(start == null) {
			start=temp;
		}else {
			temp.link=start;
			start=temp;
					
		}
	}
	public void addedElement(int data) {
		Node temp=new Node(data);
		if(start == null) {
			start=temp;
			return ;
		}else {
			Node p=start;
			while(p.link !=null) {
				p=p.link;
			}
			p.link=temp;
		}
		
	}
	public void display() {
		if(start == null) {
			System.out.println("List Is Empty..");
			return ;
		}
		Node p=start;
		while(p !=null) {
			System.out.println(p.info);
			p=p.link;
		}
	}
	public void afterNodeInsert(int data,int nodeValue) {
		if(start == null) {
			System.out.println("List Is Empty..");
			return ;
		}
		Node p=start;
		Node temp = new Node(data);
		while (p.link != null) {
			if (p.info == nodeValue) {
				break;
			}
			p = p.link;
		}
		temp.link = p.link;
		p.link = temp;
	} 
	public void beforeNode(int data, int nodeValue) {
		if (start == null) {
			System.out.println("List Is Empty..");
			return;
		}
		Node p = start;
		Node temp = new Node(data);

		if(start.info == nodeValue) {
			temp.link=start;
			start=temp;
			return ;
		}
		
		while (p.link != null) {
			System.err.println(p.link.info);
			if (p.link.info == nodeValue)
				break;
			p = p.link;
		}
		temp.link = p.link;
		p.link = temp;
	}
	public void atPosition(int data ,int value) {
		if (start == null) {
			System.out.println("List Is Empty..");
			return;
		}
		Node p=start;
		Node temp=new Node(data);
		for(int i=1;i<value-1 && p.link!=null;i++) {
			p=p.link;
		}
		temp.link=p.link;
		p.link=temp;	
	}
	public void deleteNodeParticlar(int data) {
		if (start == null) {
			System.out.println("List Is Empty..");
			return;
		}
		Node p=start;
		
		while(p.link !=null) {
			if(p.link.info == data)
				break;
			p=p.link;
		}
		p.link=p.link.link;
	}
	public void deleteFirstNode() {
		if (start == null) {
			System.out.println("List Is Empty..");
			return;
		}
		start=start.link;
	}
	public void deleteLastNode() {
		if (start == null) {
			System.out.println("List Is Empty..");
			return;
		}
		Node p=start;
		while(p.link.link !=null) {
			p=p.link;
		}
		p.link=null;
	}
	public void reveseingLinkedList() {
		Node p,prev=null,next;
		 p=start;
		while(p !=null) {
			next=p.link;
			p.link=prev;
			prev=p;
			p=next;
		}
		start=prev;
	}
	public void insertOrder(int data) {
		Node temp =new Node(data);
		if(start == null || data<start.info ) {
			temp.link=start;
			start=temp;
			return ;
		}
		Node p=start;
		while(p.link !=null && p.link.info <= data) {
			p=p.link;
		}
		temp.link=p.link;
		p.link=temp;
		
	}
	int position=1;
	public void search(int element) {
		
		Node p=start;
		while(p !=null && p.info<=element) {
			if(p.info == element)
				break;
			position++;
			p=p.link;
		}
		if(p == null || p.info != element) {
			System.out.println("Elemt Not Found..");
		}else {
			System.out.println("Element found postion : "+position);
		}	}
}
