package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo {

	public static void main(String[] args) {

		int[] ch = { 1, 1, 2, 1, 2, 1, 3 };
		int lenght = ch.length;
		int count = 0;
		for (int i = 0; i < lenght; i++) {
			for (int j = i + 1; j < lenght; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			HashMap<Integer, Integer> hs = new HashMap<>();
			if(!hs.containsKey(ch[i])) {
				hs.put(ch[i], count);
			}
			
			System.out.println(hs);
			count = 0;
		}

	}
}
