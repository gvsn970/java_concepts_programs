package com.ebolrank;

import java.time.LocalDate;

public class DateAndTime {

	public static void main(String[] args) {
		
		
	      String day=  LocalDate.of( 2017 , 8 , 14 ).getDayOfWeek().toString();
	      System.out.println(day);
	}
}
