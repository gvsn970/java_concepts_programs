package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SremasDempo {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Meta");
		fruits.add("Meta");
		fruits.add("Netflix");
		fruits.add("Meta"); // duplicate
		fruits.add("Google");
		fruits.add("Apple");
		// List<?>
		// sortList=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	List<String> uniqu = fruits.stream().sorted().distinct().collect(Collectors.toList());
		//uniqu.forEach(System.out::println);
		for (String distinctCompany : uniqu) {
			fruits.remove(distinctCompany);
		}
		fruits.forEach(System.out::println);
		
		
		List<Integer> duplicate=new ArrayList<>(Arrays.asList(1,1,1,1,21,1,4,32,5,5,6,3,6,6));
		LinkedHashSet<Integer> lsh=new LinkedHashSet<>(duplicate);
		//lsh.forEach(System.out::println);
//		duplicate.clear();
//		duplicate.addAll(lsh);
		List<?> removeDup=duplicate.stream().sorted().distinct().collect(Collectors.toList());
	//	System.out.println(removeDup);
		
	}
}
