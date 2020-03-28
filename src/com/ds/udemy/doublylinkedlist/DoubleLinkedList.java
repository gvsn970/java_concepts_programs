package com.ds.udemy.doublylinkedlist;

public class DoubleLinkedList {

	private Node start;
	DoubleLinkedList(){
		start=null;
	}
	public void insertBeginning(int data) {
		Node temp=new Node(data);
		if(start !=null) {
			temp.nxt=start;
			start.prev=temp;
			start=temp;
		}
		
	}
	public void display() {
		Node p;
		if(start == null) {
			System.out.println("List Empty ..");
			return ;
		}
		 p=start;
		 while(p!=null) {
			 System.out.println(p.info);
			 p=p.nxt;
		 }
	}
	public void insertionEmptyListAdd(int data) {
		Node temp=new Node(data);
		if(start == null) {
			start=temp;
			return ;
		}
	}
	public void insertElementLastNode(int data) {
		if(start == null) {
			System.out.println("List is Empty ..");
			return ;
		}
		Node p=start;
		Node temp=new Node(data);
		while(p.nxt!=null) {
			p=p.nxt;
		}
		p.nxt=temp;
		temp.prev=p;
	}
}
