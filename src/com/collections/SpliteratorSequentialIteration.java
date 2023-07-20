package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorSequentialIteration {

	public static void main(String[] args) {
//		List<String> names = new ArrayList<>();
//		names.add("Rams");
//		names.add("Posa");
//		names.add("Chinni");
//		System.out.println(names);
//
//		Spliterator<String> namesSpliterator = names.spliterator();
//
//		namesSpliterator.forEachRemaining(System.out::println);
		String a = "abc";
		char s[] = a.toCharArray();

		String repeated = new String(new char[7]).replace("\0", a);
		System.out.println(repeated);
		String test = "foo\0bar";
		char[] list = test.toCharArray();
		for (char ch : list) System.out.println(ch);
		System.out.println(test.length());
	}
}
