package com.onp.pip.accessSpecifiers.p1;

import java.io.IOException;

public class PrivateClass {
	private void speak() {
		System.out.println("Hey  I am speaking privately!");
	}

	public static void main(String[] args) throws IOException {
		PrivateClass ob = new PrivateClass();
		ob.speak();

	}
}
//Private access modifier limits the scope of access to the class within which we declare them. 
//It means that all the methods and the variables which are private cannot be used by a different class of the same package.