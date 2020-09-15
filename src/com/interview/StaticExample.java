package com.interview;

public class StaticExample {

	public static void main(String[] args) {
		Exa e=new Exa();
		e.m2();
	}
}
class Ex{
	static void m1() {
		
		System.out.println("Atatic Method");
	}
}
class Exa{
	 void m2() {
		 Ex.m1();
		System.out.println("Non Static Method");
	}
}

