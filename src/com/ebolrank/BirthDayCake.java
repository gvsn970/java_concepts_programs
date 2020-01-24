package com.ebolrank;

public class BirthDayCake {

	public static void main(String[] args) {
		int arr[]= {4,4,1,3};
		int maxCandleHeight=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == maxCandleHeight) {
				count++;
			}
			if(arr[i] > maxCandleHeight) {
				maxCandleHeight=arr[i];
				count=1;
			}
		}
		System.out.println(count);
	}
}
