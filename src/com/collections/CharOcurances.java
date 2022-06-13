package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOcurances {

	public static void main(String[] args) {
		String word = "java programming";
		Map<String, Long> charCount = word.codePoints().mapToObj(Character::toString)
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
		
		 Map<Integer, String> map = new HashMap<>();
		 map.put(1, "A");
		 map.put(2, "B");
		 map.put(1, "C");
		 for(Entry<Integer, String> ele:map.entrySet() ) {
			// System.out.println(ele.ge);
		 }
//		 Map<String,Long> d=word.codePoints().mapToObj(Character::toString)
//				 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				 
	}
	
}
