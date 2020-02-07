package com.ebolrank;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		while(s.hasNext()) {
			System.out.println(count+" "+s.nextLine());
			count++;
		}
	}
}
