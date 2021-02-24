package com.sample;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(23, "surya");
		hm.put(2, "surya");
		hm.put(3, "Venky");
		hm.put(4, "teja");
		System.out.println(hm);
		hm.forEach((k,v)->System.out.println(k+" "+v));;
		
		for(Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey()+"  "+e.getValue());
		}
	}

}
