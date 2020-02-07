package com.ebolrank;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("^[AZ[a-z](a-z)]");
		System.out.println(p);
	}
}
