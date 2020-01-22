package com.nexiilabs.string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringExample1 {

	public static void main(String[] args) {
		String s="surya";
		s=s.concat("narayana");
		System.out.println(s);
		"abc".charAt(0);
		
		  List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
	         
	        String joinedString = String.join(" | ", listOfStrings);
	         
	        System.out.println(joinedString);
	        
	        
	        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
	         
	        stringJoiner.add("Facebook");
	         
	        stringJoiner.add("Twitter");
	         
	        stringJoiner.add("YouTube");
	         
	        stringJoiner.add("WhatsApp");
	         
	        stringJoiner.add("LinkedIn");
	         
	        System.out.println(stringJoiner);
	}
}
