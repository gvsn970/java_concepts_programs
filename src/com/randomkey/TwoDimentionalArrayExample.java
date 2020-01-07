package com.randomkey;

import java.util.Scanner;

public class TwoDimentionalArrayExample {

	public static void main(String[] args) {
		int column=3,row=3;
		int[][] a = new int[row][column];
		Scanner s=new Scanner(System.in);
		System.out.println("Ente"
				+ "Enter array Elements :");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
					a[i][j]=s.nextInt();
			}
		}
		System.out.println("2-D Elements are : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		s.close();
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(j != column && i == 0) {
					sum=sum+a[i][j];
				}
				
			}
			
		}
		System.out.println(sum);
	}
}
