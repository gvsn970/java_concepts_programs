package com.ebolrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {

		Scanner intscan = new Scanner(System.in);
		int num = intscan.nextInt();

		List<String> str = new ArrayList<String>();
		for (int i = 0; i <= num; i++) {
			str.add(intscan.nextLine());
		}
		for (String s : str) {
			if(!s.equals("")) {
				char a[] = s.trim().toCharArray();
				String eventemp = "";
				String oddtemp = "";
				for (int i = 0; i < a.length; i++) {
					if (i % 2 == 0) {
						eventemp += a[i];
					} else {
						oddtemp += a[i];
					}
				}
				System.out.println(eventemp + " " + oddtemp);
			}
		
		}
		intscan.close();
	}
}
