package com.date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFromatExample {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);

		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss ");
		strDate = formatter.format(date);

		SimpleDateFormat	formatter1 = new SimpleDateFormat("dd-MMMM-yyyy hh:mm a");
		strDate = formatter1.format(date);
		System.out.println("Date Format with dd MMMM yyyy : "+strDate);

		formatter1 = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formatter1.format(date);
		System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);

		formatter1 = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		strDate = formatter1.format(date);
		System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);

		String dateString = "20221125";
		String timeString = "553";

		DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyyMMdd Hmm");
		LocalDateTime dateTime = LocalDateTime.parse(dateString + " " + timeString, parser);
		System.err.println(dateTime);
		// Format without "T" and print in one line 
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));

	}
}
