package com.interview.twentytwenty;

public class NewPassword {

	public static void main(String[] args) {
		String a = "abceas";
		String b = "zyx";
		char[] arr = a.toCharArray();
		char[] brr = b.toCharArray();
		String pwd = "";
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			pwd += arr[i];
			for (int j = i; j < brr.length; ) {
				pwd += brr[j];
				break;
			}
			count++;
		}
		if (arr.length < brr.length) {
			for (int j = count; j < brr.length; j++) {
				pwd += brr[j];
			}
		}
		System.out.println(pwd);
	}
}
