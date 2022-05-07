package com.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) {
		 List < String > fruits = new ArrayList < String > ();
	        fruits.add("Banana");
	        fruits.add("Apple");
	        fruits.add("Mango");
	        fruits.add("Orange");

	        List sortedList=fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	        System.out.println(sortedList);
	}
}
