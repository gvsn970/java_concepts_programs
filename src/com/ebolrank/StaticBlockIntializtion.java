package com.ebolrank;

import java.util.Scanner;

public class StaticBlockIntializtion {

	static int B=0;
	static int H=0;
	static boolean flag=true;
	static int area=0;
	static {
		Scanner scan= new Scanner(System.in);
		B=scan.nextInt();
		H=scan.nextInt();
		scan.close();
		try {
			if(B<= 0 || 0 >= H) {
				throw new Exception(" Breadth and height must be positive");
			}
			
		}catch(Exception e) {
			System.out.println(e);
			System.exit(0);
		}
		
	}
	public static void main(String[] args) {
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}
