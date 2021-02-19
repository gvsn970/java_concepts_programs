package com.onp.pip.accessSpecifiers.p1;

class ProtectedClass {
	
	protected void speak() {
	    System.out.println("Hello I am speaking in protected mode!");
	  }
}
public class ProtectedClass1 extends ProtectedClass{
	public static void main(String[] args) {
		ProtectedClass1 ob = new ProtectedClass1();
	    ob.speak();
	  }
	
}
