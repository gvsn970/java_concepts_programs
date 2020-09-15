package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DEmo {

	public static void main(String[] args) {

	/*	List<DNSOExampleEmplyoeeObject> l1=new ArrayList<>();
		l1.add(new DNSOExampleEmplyoeeObject(1,"z",50000));
		l1.add(new DNSOExampleEmplyoeeObject(2,"Z",59000));
		l1.add(new DNSOExampleEmplyoeeObject(4,"z",56000));
		l1.add(new DNSOExampleEmplyoeeObject(5,"aa",59000));
		l1.add(new DNSOExampleEmplyoeeObject(3,"bb",950000));
		l1.add(new DNSOExampleEmplyoeeObject(7,"t",10000));
		//Collections.sort(l1);
		
		l1.sort(Comparator.comparing(DNSOExampleEmplyoeeObject :: getName).thenComparing(DNSOExampleEmplyoeeObject :: getName));
		System.out.println(l1);
		for(DNSOExampleEmplyoeeObject n : l1) {
			System.out.println(n.getName());
		} */
		String[] array = {"Z", "X", "C", "B", "A"};
		
		List<String> lw = Arrays.asList(array);
		List<String> sortedList = lw.stream().sorted().collect(Collectors.toList());     
		sortedList.forEach(System.out::println);  
	
		List<CNSOExampleEmplyoeeObject> l = new ArrayList<>();
		l.add(new CNSOExampleEmplyoeeObject("a", 1));
		l.add(new CNSOExampleEmplyoeeObject("ram", 2));
		l.add(new CNSOExampleEmplyoeeObject("rahul", 3));
		l.add(new CNSOExampleEmplyoeeObject("tilak", 4));
		l.add(new CNSOExampleEmplyoeeObject("surya", 5));
		
		//Collections.sort(l,(e1,e2) -> e1.name.compareTo(e2.name));
		//Collections.sort(l,(e1,e2) -> e1.id>e2.id?1: e1.id <e2.id ? -1 : 0);
		//l.stream().sorted().collect(Collectors.toList());
		
	//l.stream().forEach(System.out::println);
		l.stream().sorted((CNSOExampleEmplyoeeObject e1,CNSOExampleEmplyoeeObject e2)-> (e1.id>e2.id)?-1:(e1.id<e2.id)?1:0);
		}
}
