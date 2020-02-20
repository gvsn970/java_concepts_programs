package com.abstractt;

abstract class Test1{
	abstract public void test1();
	public void test() {
		System.out.println("Test method 1 ");
	}
}

public class AbstarctClassxample extends Test1{

	
	public static void main(String[] args) {
		AbstarctClassxample a=new AbstarctClassxample();
		a.test();
		
	}

	@Override
	public void test1() {
		System.out.println("Test Method");
		
	}
	public void amethod() {
		test1();
	}
}
