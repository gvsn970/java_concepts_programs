package com.sample;

public class ReplaceMethod {

	public static void main(String[] args) {

		/*
		 * Pattern p = Pattern.compile(
		 * "(http://|https://)(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?");
		 * Matcher m; m=p.matcher(url); boolean flag= m.find() && m.group().equals(url);
		 * System.out.println(flag);
		 */

		String ncdUrl = "http://www.nexiilabs.nocheatingdude.com";
		/*
		 * if(url.contains("https")){ System.out.println(url.substring(8,16)); }else if
		 * (url.contains("http")) { System.out.println(url.substring(7,16)); }
		 */
		//String domianName = "";
		ncdUrl = ncdUrl.replace("https://", "");
		ncdUrl = ncdUrl.replace("http://", "");
		ncdUrl = ncdUrl.replace("www.", "");
		System.out.println("domianName : "+ncdUrl.substring(0,ncdUrl.indexOf('.')));
		//String s[]=ncdUrl.trim().split(".");
		//System.out.println(s[0]);

	}
}
