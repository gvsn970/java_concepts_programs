package com.constructor;

public class ArraySum {

	public static void main(String[] args) {
		int a[]=new int[] {1,1,0,0,1,1,1,1,0,1};
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i] == a[i+1]) {
				count++;
				if(count >3) {
					System.out.println(a[i]);
				}
			}
			
		}
		
	}

}
