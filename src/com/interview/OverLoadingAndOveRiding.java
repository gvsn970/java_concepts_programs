package com.interview;

class Parent{
	 Double m1() {
		System.out.println("Parent Method");
		return null;
	}
	void m1(int i) {
		System.out.println( i+"Parent Method");
	}
}
class Child extends Parent
{
	public Double m1() {
		System.out.println("Child Method");
		return null;
	}
}

public class OverLoadingAndOveRiding {
	
	public static void main(String[] args) {
		
		Parent  p=new Child();
		p.m1();
	}

}
