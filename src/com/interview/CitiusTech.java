package com.interview;

public class CitiusTech {

	public static void main(String[] args) {
//		Integer a = 8;
//		Integer b = 10;
//		Integer temp = b;
//		b=a;
//		a=temp;
//		System.out.println(a + "--" +b);
		
		
		String a = new String("abc");
		String b = "abc";
		String z = "abc";
		String c = a;
		String g = b;
		a = null;
		b = null;

		System.out.println(c +" -- "+ b);
		
		String xyz = "I am superman";
		String x=xyz.substring(2,5);
		System.out.println(x);
		
//		String static = "I am static";
//		String public= "I am public";
//		String void= "I am void";
		
	}
}
