package com.interfaceby.rathan;

interface it1{
	void m1();
	void m2();
	void m3();
}

abstract class test1 implements it1{

	public void m1() {
		System.out.println("m1 method");
	}	
}abstract class test2 extends test1{

	public void m2() {
		System.out.println("m2 method");
	}	
}
public class InterfaceExample1 extends test2{

	@Override
	public void m3() {
		System.out.println("m3 method");
	}
public static void main(String[] args) {
	InterfaceExample1 t=new InterfaceExample1();
	t.m1();
	it1 t1=new InterfaceExample1();
	t1.m2();
}
}
