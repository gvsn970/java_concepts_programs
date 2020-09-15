package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ConcurrentHaspExample1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<>();
		h.put(101, "surya");
		h.putIfAbsent(101, "Narayna");
		h.put(102,"Venkat");
		h.put(103, "Gosala");
		//h.remove(key, value)
		System.out.println(h);
		System.out.println();
		for(Entry<Integer, String> r : h.entrySet()) {
			System.out.println(r.getKey() +" "+ r.getValue());
		}
		
		
//		System.out.println();
//		Set<Integer> result=h.keySet();
//		for(Integer key : result) {
//			String value=h.get(key);
//			System.out.println(key +" "+value);
//		}
		
	}
}
