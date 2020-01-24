package com.ebolrank;

import java.util.Scanner;

public class Stdion {

public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 String s=scan.next();
	 int i = scan.nextInt();
     double d = scan.nextDouble();
     
     // Write your code here.

     System.out.println("String: " + s);
     System.out.println("Double: " + d);
     System.out.println("Int: " + i);
     scan.close();
}
}
