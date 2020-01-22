package com.ebolrank;

public class VeryBigSum {

	public static void main(String[] args) {
		
		long value=0;
		long b[]=new long[10];
		
		long sum=0;
		for(int i=0;i<b.length;i++) {
			
			sum=sum+b[i];
			
		}
		System.out.println(sum);
		
	}
}
