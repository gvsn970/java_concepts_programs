package com.randomkey;

public class RandomString {

	// function to generate a random string of length n
	static String getAlphaNumericString(int n) {

		// chose a Character random from this String
		String alphanumericstring = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);
		System.out.println(Math.random());
		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length

			int index = (int) (alphanumericstring.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(alphanumericstring.charAt(index));
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		// Get the size n
		int n = 20;

		// Get and display the alphanumeric string
		System.out.println(RandomString.getAlphaNumericString(n));
	}
}