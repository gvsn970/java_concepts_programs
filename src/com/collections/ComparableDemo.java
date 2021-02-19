package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<EmployeePojo> list = new ArrayList<EmployeePojo>();
		list.add(new EmployeePojo(11, "AB", "23233"));
		list.add(new EmployeePojo(1, "BC", "30000"));
		list.add(new EmployeePojo(41, "ZC", "20000"));
		list.add(new EmployeePojo(81, "DE", "50000"));
		list.add(new EmployeePojo(31, "QW", "6000"));
		list.add(new EmployeePojo(10, "YT", "1000"));
		Collections.sort(list);
		for (EmployeePojo emp : list) {
			System.out.println(emp);
		}
	}
}
