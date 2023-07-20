package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeTestingJuly {

	public static void main(String[] args) {
		 String dateString = "20221125";
	        String timeString = "0"; // Update the time here if needed

	        // Parse the date
	        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyyMMdd"));

	        // Parse or set the time
	        LocalTime time;
	        if (timeString.equals("0")) {
	            time = LocalTime.MIDNIGHT;
	        } else {
	            time = LocalTime.parse(timeString, DateTimeFormatter.ofPattern("Hmm"));
	        }

	        // Combine date and time
	        LocalDateTime dateTime = LocalDateTime.of(date, time);

	        // Format without "T" and print in one line
	        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
	}
}
