package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



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
		
		List<Integer> num=al.stream().distinct().collect(Collectors.toList());
		System.out.println(num);

		String[] arr= {"aa","bb","aa","dd","rr"};
		List<String> listArr=Arrays.asList(arr);
		System.out.println(listArr);
		List<String> outDuplicate=listArr.stream().distinct().collect(Collectors.toList());
		System.out.println(outDuplicate);
		
		String[] arr1= outDuplicate.toArray(new String[0]);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
