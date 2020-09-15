package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Stream;

public class ArrayListDuplicateFind {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(13);
		al.add(12);
		al.add(13);
		al.add(23);
		al.add(23);
		al.add(87);
		al.add(37);
		al.add(57);
		System.out.println("Duplicates : "+al);
		
		System.out.println();
		
		Stream<Integer> stream = al.stream();
		stream.reduce((first, second) -> second)
		  .orElse(null);
		//stream.forEach(System.out:: println);;
		
		/*System.out.println("With Duplciates :");
		for(int i=0; i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					System.out.println(al.get(j));
				}
			}
		}
		HashSet set=new HashSet();
		System.out.println();
		for(Integer r : al) {
			if(set.add(r) == false) {
				System.out.println(r);
			}
		}*/
	}
}
