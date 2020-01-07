package com.date;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		
		Date date = new Date();

		/*SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
		String strDate = formatter.format(date);

		strDate = formatter.format(date);
		System.out.println("Date Format with dd MMMM yyyy : "+strDate);*/
		System.out.println(date);
		System.out.println(date.getTime());
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		System.out.println("Us Date Format :"+DateFormat.getDateInstance(1,Locale.US).format(new Date() ));

		
	}
}
