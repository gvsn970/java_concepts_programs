package com.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

final public class Sort {

	public static void main(String[] args) {
		int num=123;
		int temp=num;
		int rev=0;
		while(num !=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(temp == rev) {
			System.out.println("Given Number Palindrom");
		}else {
			System.out.println("Not Given Number Palindrom");
		}
	}
	
}


