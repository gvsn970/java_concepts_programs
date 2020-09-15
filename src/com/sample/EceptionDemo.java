package com.sample;

public class EceptionDemo {
	
	final static short x = 2;
    public static int y = 0;
	public static void main(String[] args) {
		
		String permissions="2,3,7,9,10,11";
		permissions=permissions.trim().substring(0, permissions.length() - 3);
		System.out.println(permissions);
	}

}
