package com.nexiilabs.string;

public class StringExample2 {

	public static void main(String[] args) {
		String s="";
		s="surya";
		if(s.equals("surya")) {
			s=s.concat("Fine");
		}
		//System.out.println(s);
		
		String s1 = new String("nilakshi");
		String s2 = "harshada";
		String s3 = "nilakshi";
		s1 = "harshada";

		if(s1 == s2)
		System.out.println("s1 and s2 has same reference");
		else
		System.out.println("s1 and s2 doesn’t have same reference");

		s1 = new String("nilakshi");

		if(s1 == s3)
		System.out.println("s1 and s3 has same reference");
		else
		System.out.println("s1 and s3 doesn’t have same reference");
		
	}
}
