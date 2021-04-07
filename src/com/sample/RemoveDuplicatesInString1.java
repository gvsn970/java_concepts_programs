package com.sample;

public class RemoveDuplicatesInString1 {

	public static void main(String[] args) {
		String str = "ssurysry";
		char[] a = str.toCharArray();
		int length = a.length;
		int count = 0;
		for (int i = 0; i < length; i++) {

			for (int j = 0; j < length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			for (int j = i + 1; j < length; j++) {
				if (a[i] == a[j]) {
					a[j] = a[length - 1];
					length--;
					// --;
				}
			}

			System.out.println(a[i] + " No OF count ::" + count);
			count = 0;

		}

	}
}
