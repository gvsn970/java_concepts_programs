package com.interview;

import java.util.Scanner;

public class ZemosoInterviewQuestion2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		String[] a = { "Mon", "Tue", "Wed", "Thru", "Fri", "Sat", "Sun" };
		String week = null;
		int stringIndex = 0;
		System.out.println("Enter a Number :");
		int num = s.nextInt();
		System.out.println("Enter a String  :");
		week = s1.nextLine();
		s.close();
		s1.close();
		for (int i = 0; i < a.length; i++) {
			if (a[i].trim().equalsIgnoreCase(week)) {
				
				stringIndex = i;
				break;
			}
		}
		int finalNumber=stringIndex+num;
		System.out.println(finalNumber);
		if(finalNumber<7) {
			System.out.println("Expeted week : "+a[finalNumber]);
		}else {
			System.out.println("Expected  week :"+a[finalNumber%7]);
		}
	}
}
