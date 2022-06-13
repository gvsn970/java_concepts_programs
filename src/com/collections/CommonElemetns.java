package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElemetns {

	public static void main(String[] args) {
		   // create ArrayList list1
        ArrayList<String>
            list1 = new ArrayList<String>();
  
        // Add values in ArrayList
        list1.add("Hii");
        list1.add("Geeks");
        list1.add("for");
        list1.add("Geeks");
  
        // print list 1
        System.out.println("List1: "
                           + list1);
  
        // Create ArrayList list2
        ArrayList<String>
            list2 = new ArrayList<String>();
  
        // Add values in ArrayList
        list2.add("Hii");
        list2.add("Geeks");
        list2.add("Gaurav");
  
        // print list 2
        System.out.println("List2: "
                           + list2);
        List<?> str=list2.stream().filter(list1::contains).collect(Collectors.toList());
        System.out.println(str);

	}
}
