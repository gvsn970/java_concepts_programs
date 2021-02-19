package com.onp.pip.accessSpecifiers.p1;

import java.io.IOException;

class AccessSpecifiers {
	
   void speak() {
    System.out.println("Hello I am speaking in default mode!");
  }
  
  
}
 public class DefaultClass1{
	  public static void main(String[] args) throws IOException {
	    AccessSpecifiers ob = new AccessSpecifiers();
	    //speak() is not declared public so it Cannot be accessed from one package to another package.
	    ob.speak();
	  }
 }
