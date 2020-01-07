package com.ds.operations;

import java.util.Scanner;

public class BinarySearchInArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 6, 7, 8, 9, 12, 13, 45 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Enter Search element :");
		Scanner s = new Scanner(System.in);
		int searchElement = s.nextInt();
		s.close();
		int li = 0;
		int hi = a.length - 1;
		int mid = (li + hi) / 2;
		System.out.println("mid " + mid);
		while (li <= hi) {
			if (a[mid] == searchElement) {
				System.out.println("Element Found At pos " + mid);
				break;
			} else if (a[mid] < searchElement) {
				li = mid + 1;
			} else {
				hi = mid - 1;
			}
			mid = (li + hi) / 2;
		}

	}
}
