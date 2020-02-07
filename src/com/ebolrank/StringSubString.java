package com.ebolrank;

import java.util.Scanner;

public class StringSubString {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int len1=A.length();
	        int len2=B.length();
	        System.out.println(len1+len2);
	        System.out.println(A.compareTo(B)>0 ?"Yes":"No");
	        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+
	        B.substring(0,1).toUpperCase()+B.substring(1));
	        
	        System.out.println(A.substring(2,4));
	}
}
