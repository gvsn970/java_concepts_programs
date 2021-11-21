package com.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HasgMapExample {

	public static void greeting() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		HasgMapExample staticex=null;;
		staticex.greeting();

		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(null, "AB");
		hs.put(null, "AB");
		hs.put(2, "AB");

		Set<Integer> s = hs.keySet();
		System.out.println();
		System.out.println(hs);
		System.out.println();
		for (Map.Entry<Integer, String> map : hs.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}

		System.out.println();
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "AB");

		ht.put(1, "BC");
		System.out.println(ht);

		Map<String, Column> original = new HashMap<>();
		original.put("foo", new Column());
		original.put("bar", new Column());

		Map<String, Column> copy = original.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, e -> new Column(e.getValue())));

		System.out.println(original);
		System.out.println(copy);
	}

	static class Column {
		public Column() {
		}

		public Column(Column c) {
		}
	}

	
}

