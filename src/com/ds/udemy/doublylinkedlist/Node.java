package com.ds.udemy.doublylinkedlist;

public class Node {

	public int info;
	public Node prev;
	public Node nxt;
	
	public Node(int i) {
		info=i;
		prev=null;
		nxt=null;
	}
}
