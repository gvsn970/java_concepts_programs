package com.ebolrank;

public class JavaLoop {

	public static void main(String[] args) {
		
		int a=0,b= 2,n= 10;
		int reulst=0;
		for(int i=0;i<n;i++) {
			
			a= a+((int)Math.pow(2,i)*b);
			System.out.print(a+" ");
		}
		
	}
}
