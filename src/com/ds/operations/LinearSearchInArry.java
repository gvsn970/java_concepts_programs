package com.ds.operations;

import java.util.Scanner;

public class LinearSearchInArry {

	public static void main(String[] args) {
		int a[]= {2,3,4,6,77,8,9,12,3,45};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter Search element :");
		Scanner s=new Scanner(System.in);
		int searchElement=s.nextInt();
		s.close();
		for(int i=0;i<a.length;i++) {
			if(a[i]== searchElement) {
				System.out.println("Element FoundAt position "+i);
				temp=temp+1;
			}
		}
		if(temp ==0) {
			System.out.println("Eleemnt not Found");
		}
		
	}
}
