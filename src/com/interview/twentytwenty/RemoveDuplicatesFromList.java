package com.interview.twentytwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		;
		System.out.println(l);
		ArrayList<Integer> list = removeDupicates(l);
		System.out.println(list);
		Set<Integer> set=new HashSet<>();
		for(Integer e : l) {
			set.add(e);
		}
		System.out.println(set);
		
	}

	private static ArrayList<Integer> removeDupicates(ArrayList<Integer> l) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (Integer element : l) {
			if (!newList.contains(element)) {
				newList.add(element);
			}
		}

		return newList;
	}
}
