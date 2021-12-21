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
			for (int k = i + 1; k < length; k++) {
				if (a[i] == a[k]) {
					a[k] = a[length - 1];
					//System.err.println(a[length - 1]);
					//System.err.println(length--);
					length--;
				}
			}

			System.out.println(a[i] + " No OF count ::" + count);
			count = 0;

		}

	}
}
