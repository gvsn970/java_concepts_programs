package com.ebolrank;

import java.math.BigDecimal;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConvertor {

	public static void main(String[] args) {
		   double val = 12324.134;

	        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
	        System.out.println(us.format(val));
	        
	        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("pn","IN"));
	        System.out.println(india.format(val));
	        
	        NumberFormat chaina = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
	        System.out.println(chaina.format(val));
	        
	        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        System.out.println(france.format(val));
	        
	  
	}
}
