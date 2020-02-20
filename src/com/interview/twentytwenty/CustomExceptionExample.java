package com.interview.twentytwenty;

class InvalidExceptionException extends RuntimeException {
	InvalidExceptionException(String s) {
		super(s);
	}
}

public class CustomExceptionExample {

	public static void main(String[] args) throws InvalidExceptionException {

		try {
			validate(15);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m.getLocalizedMessage());
		}

		System.out.println("rest of the code...");
	}

	static void validate(int age) throws InvalidExceptionException {
		if (age < 18)
			throw new InvalidExceptionException("not valid");
		else
			System.out.println("welcome to vote");
	}

}
