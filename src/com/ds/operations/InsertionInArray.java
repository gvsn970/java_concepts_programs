package com.ds.operations;

import java.util.Scanner;
/**
 * 
 * @author nexii
 *
 */
public class InsertionInArray {

	public static void main(String[] args) {
		System.out.println("Enter Arrya Size:");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arry[] = new int[size+1];
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < size; i++) {
			arry[i] = s.nextInt();
		}
		System.out.println("Array Elelemts");
		for (int i = 0; i < size; i++) {
			System.out.print(arry[i] + " ");
		}
		System.out.println();
		System.out.println("Enter position :");
		int pos = s.nextInt();
		System.out.println("Enter elements :");
		int ele = s.nextInt();
		for (int i = size-1; i >= pos-1; i--) {
			arry[i+1] = arry[i];
			
		}
		arry[pos-1] = ele;
		System.out.println("Final Elements: ");
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
}
