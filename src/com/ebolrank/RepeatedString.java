package com.ebolrank;

import java.util.Scanner;

public class RepeatedString {

	 private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		  String s = scanner.nextLine();

	        long n = scanner.nextLong();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        System.out.println(s);
	}
}
