package com.logging;

public class LoggingDemo {
	public static void main(String[] args) {
		String words = "hi Hello Hi Surya Ram Hello Hi Sriniva";
		String ch[] = words.split(" ");
		//String ansArry[]=
		for(int i=0;i<ch.length;i++) {
			if(ch[i].startsWith("h") || ch[i].startsWith("H")) {
				System.out.println(ch[i]);
			}
		}
	}

}
