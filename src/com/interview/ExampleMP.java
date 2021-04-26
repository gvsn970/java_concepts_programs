package com.interview;

public class ExampleMP {

	public static void main(String[] args) {
		int i=553;
		String str=String.valueOf(i);
		char[] ch=str.toCharArray();
		int num=1;
		for(int j=0;j<ch.length;j++) {
			num=num*i;
		}
		System.out.println(num);
	}
}
