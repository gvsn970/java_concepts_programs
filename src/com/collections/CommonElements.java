package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		List<Integer> bList = new ArrayList<>(Arrays.asList(2, 3, 4, 6, 7));
		// Union is all from both lists.
		List<Integer> union = new ArrayList(aList);
		union.addAll(bList);
		// Intersection is only those in both.
		List<Integer> intersection = new ArrayList(aList);
		intersection.retainAll(bList);
		// Symmetric difference is all except those in both.    
		List<Integer> symmetricDifference = new ArrayList(union);
		symmetricDifference.removeAll(intersection);

		System.out.println("aList: " + aList);
		System.out.println("bList: " + bList);
		System.out.println("union: " + union);
		System.out.println("intersection: " + intersection);
		System.out.println("**symmetricDifference: " + symmetricDifference+"**");
	}
}
