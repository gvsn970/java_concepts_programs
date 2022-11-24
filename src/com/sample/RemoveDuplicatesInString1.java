package com.sample;

public class RemoveDuplicatesInString1 {

	public static void main(String[] args) {
		String str = "ssurysry";
		char[] a = str.toCharArray();
		int length = a.length;
		System.out.println(length);
		int count = 0;
		for (int i = 0; i < length; i++) {

			if (a[i] == 's') {
				a[i] = a[length - 1];

				length--;
			}
		}
		
		

	}
}
