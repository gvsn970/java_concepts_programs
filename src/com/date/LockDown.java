package com.date;

import java.time.LocalDate;

public class LockDown {

	public static void main(String[] args) {
	
		LocalDate date=LocalDate.now();
		System.out.println(date.getChronology());
		
		//LocalDateTime dateTime=LocalDateTime.of(2020,Month.AUGUST,23);
	}
}
