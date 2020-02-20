package com.interview.twentytwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class AssendingOrder {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>(Arrays.asList(10,13,2,4,5,3,5));
		System.out.println(l);
		TreeSet<Integer> t=new TreeSet<>();
		for(Integer list : l) {
			t.add(list);
		}
		System.out.println(t);
	}
}
