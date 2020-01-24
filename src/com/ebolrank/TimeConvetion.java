package com.ebolrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConvetion {

	public static void main(String[] args) {
		   String input = "10:22:12PM";
		      DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
		      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
		      Date date = null;
		      String output = null;
		      try{
		    	 date= df.parse(input);
		    	 output = outputformat.format(date);
		    	 System.out.println(output);
		      }catch(ParseException pe){
		         pe.printStackTrace();
		       }
		      Scanner scan = new Scanner(System.in);
		      double d = scan.nextDouble();
		      String s=scan.nextLine();
	}
}
