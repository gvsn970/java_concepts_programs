package com.ebolrank;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String s="Java";
		String s1="avJa";
		char a[]=s.toCharArray();
		char b[]=s1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b));
	}
}
