package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<EmployeePojo> list = new ArrayList<EmployeePojo>();
		list.add(new EmployeePojo(11, "ZS", "23233"));
		list.add(new EmployeePojo(1, "BC", "30000"));
		list.add(new EmployeePojo(41, "ZC", "20000"));
		list.add(new EmployeePojo(81, "DE", "50000"));
		list.add(new EmployeePojo(31, "QW", "60000"));
		list.add(new EmployeePojo(10, "YT", "100000"));

		Collections.sort(list, new EmpNameSorter());
		
		for (EmployeePojo emp : list) {
			System.out.println(emp);
		}

	}
}
