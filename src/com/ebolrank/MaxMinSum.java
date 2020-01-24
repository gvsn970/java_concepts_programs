package com.ebolrank;

public class MaxMinSum {

	public static void main(String[] args) {
		int minNum = 0, maxNum = 0;
		int minSum = 0,maxSum=0;
		int arr[] = { 256741038, 623958417, 467905213, 714532089, 938071625};
		
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			

		}
		
		minNum=arr[0];
		maxNum=arr[arr.length-1];
		System.out.println(minNum +" "+maxNum);
		
		for (int i = 0; i < 5; i++) {
			if(arr[i] !=maxNum) {
				minSum=minSum+arr[i];
			}
			if(arr[i] !=minNum) {
				maxSum=Math.abs(maxSum+arr[i]);
			}

		}
		
	
		System.out.println(minSum + "  " + maxSum);

	}
}
