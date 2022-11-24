package com.collections;

public class TestDemo2 {

	public static void main(String[] args) {

		int num = 1221;
		int temp = num;
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		if (rev == temp) {
			System.out.println("plindrome Number");
		} else {
			System.out.println("Not a plindrome Number");
		}
		String s= "ABABBAAAA";
		 int deletetionCount=0;
	        for(int i=0;i<s.length()-1;i++){
	            if(s.charAt(i) != s.charAt(i+1)){
	                 System.out.println(s.charAt(i));
	            }
	        }
	        System.out.println(deletetionCount);
	}
}
