package com.sample;

public class RemoveDuplicatesInString1 {

	public static void main(String[] args) {
		String str="ssury";
		char[] a=str.toCharArray();
		int length=a.length;
		for(int i=0;i<length;i++) {
			if(a[i] == a[i+1]) {
				a[i+1]=a[length-1];
				length--;
				//--;
			}
			System.out.println(a[i]);
			
		}
		
	}
}
