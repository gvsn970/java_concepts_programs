package com.ds.operations;

import java.util.Scanner;

public class DeleteingArryElement {

	public static void main(String[] args) {
		System.out.println("Enter array size:");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		System.out.println("Enter Array Elements :");
		int arry[] = new int[size];
		for (int i = 0; i < size; i++) {
			arry[i] = s.nextInt();
		}
		System.err.println("Entered Elements :");
		for (int i = 0; i < size; i++) {
			System.out.print(arry[i] + " ");
		}
		System.out.println();
		System.out.println("Enter Delete Number :");
		int ele = s.nextInt();
		s.close();
		for (int i = 0; i < size; i++) {
			if (arry[i] == ele) {
				for (int j = i; j < size - 1; j++) {
					arry[j] = arry[j + 1];
				}
				break;
			}
		}
		for (int i = 0; i < size - 1; i++) {
			System.out.print(arry[i] + " ");
		}
	}
}
