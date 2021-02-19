package com.collections;

import java.util.Comparator;

public class EmpNameSorter implements Comparator<EmployeePojo>{

	@Override
	public int compare(EmployeePojo o1, EmployeePojo o2) {

		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
