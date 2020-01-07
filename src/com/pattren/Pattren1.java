package com.pattren;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattren1 {

	public static void main(String[] args) {
		String s="A,B,C,D,E,";
		Pattern p=Pattern.compile("[a-zA-Z]([,][a-zA-Z]+)+");
		Matcher m=p.matcher(s);
		boolean flag= m.find() && m.group().equals(s);
		System.out.println(flag);
	}
}
