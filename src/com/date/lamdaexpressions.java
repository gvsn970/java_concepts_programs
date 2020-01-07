package com.date;

import java.util.ArrayList;

public class lamdaexpressions {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(365);
		al.add(35);
		al.add(34);
		al.add(31);
		al.add(3);
		al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).forEach(System.out:: println);;
	}
}
