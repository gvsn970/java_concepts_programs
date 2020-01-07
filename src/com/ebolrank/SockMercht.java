package com.ebolrank;

import java.util.Scanner;

public class SockMercht {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int s = 0;
		int a[] = new int[size];
		int len=a.length;
		int count = 0;
		int pairCount=0;
		int temp=0;
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}

		scanner.close();

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {

				if (a[i] > a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[i]=temp;
				}

			}
			for(int k=0;k<len;k++) {
				if(a[i] == a[k]) {
					count++;
				}
			}
			for (int z = i + 1; z < len; z++) {

				if (a[i] == a[z]) {
					a[z] = a[len - 1];
					len--;
					z--;
				}

			}
			System.out.println(" no of occureance : " +a[i]+ " "+count);
			if(2<=count) {
				pairCount+=count/2;
			}
			count=0;
			

		}
		System.out.println("pair count :"+pairCount);

	}
}
