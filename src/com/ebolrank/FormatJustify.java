package com.ebolrank;

import java.util.Formatter;
import java.util.Scanner;

public class FormatJustify {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
          Formatter fmtRight = new Formatter();
          Formatter fmtLeft = new Formatter();
         for(int i=0;i<3;i++)
         {
             String s1=sc.next();
             int x=sc.nextInt();

             //Complete this line
             System.out.printf(fmtRight.format("%15.2f", s1)+""+fmtLeft.format("%-3", x));
            
         }
         System.out.println("================================");
	}
}
