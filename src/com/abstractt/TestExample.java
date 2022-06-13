package com.abstractt;

 class  Parent {
	void m1() throws ArithmeticException {
		System.out.println("Parent Method");
	}
}
 class Child extends Parent{
	 void m1() {
			System.out.println("Child Method");
		}
 }
public class TestExample {

	public static void main(String[] args) {
		
		// SELECT max(Salary) From EMp WHERE Salary <(SELECT max(Salary) From EMp
		// Salary);
		Child c = new Child();
		// c.m1();
		Parent p = c;
		c.m1();
		
	}
	
}
