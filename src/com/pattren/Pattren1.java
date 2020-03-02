package com.pattren;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattren1 {

	public static void main(String[] args) {
		String s="9701316397";
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		//Pattern p=Pattern.compile("([a-zA-Z0-9.]+)+@[a-zA-Z0-9][.][a-zA-Z0-9]");
		Matcher m=p.matcher(s);
		boolean flag= m.find() && m.group().equals(s);
		System.out.println(flag);
	}
}
