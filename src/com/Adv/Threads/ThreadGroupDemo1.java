package com.Adv.Threads;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ThreadGroupDemo1 {

	public static void main(String[] args) {
		int age=20;
		if(age>19) {
			throw new Emp("Custom Exeption ");
		}
			
	}
}

class Emp extends RuntimeException{
	private String s;

	public Emp(String string) {
		super(string);
	}

	
	

}