package com.ds.operations;

public class SelectionSortArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 6, 7, 8, 9, 12, 13, 45 };
		int min=0,temp=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
