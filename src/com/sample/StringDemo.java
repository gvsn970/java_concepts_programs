package com.sample;

public class StringDemo {
	public static void main(String[] args) {

		final String s1="surya";
		String s2="content change";
		String s3="surya content change";
		String s4="surya "+"content change";
		String s5=s1+" content change";
		System.out.println(s4 == s5);
				
	}
}
