package com.methosreference;

 class Test{
	public  static void m1() {
		System.out.println("Static Method");
	}
}
 interface interf{
	 public void m1();
 }

public class StaticMethodRefennceExample {

	public static void main(String[] args) {
		interf i=Test :: m1;
		
	}
}
