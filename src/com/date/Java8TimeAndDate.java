package com.date;

import java.time.ZoneId;
import java.util.Locale;

/**
 * 
 * @author nexii
 *
 */
public class Java8TimeAndDate {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		for (String z : ZoneId.getAvailableZoneIds()) {
			// System.out.println(z);
		}
		int count = 0;
		String[] locales = Locale.getISOCountries();

		for (String countryCode : locales) {

			Locale obj = new Locale("", countryCode);

			System.out.println("Country Code = " + obj.getCountry() + ", Country Name = " + obj.getDisplayCountry());
			count++;
		}
		System.out.println("No OF Countries :" + count);
		
		
	}
	Runnable r=new Runnable() {
		
		@Override
		public void run() {
			
		}
	};
}
