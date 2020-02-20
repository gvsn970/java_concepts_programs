package com.interview.twentytwenty;

import java.util.ArrayList;

class Employee implements Comparable<Employee>{
	private String name;
	private int id;
	private double salary;

	public Employee(String name, int id, double i) {
		super();
		this.name = name;
		this.id = id;
		this.salary = i;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", id=");
		builder.append(id);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Employee o) {
		
		return 0;
	}
	
	

}

public class AssendingOrderObject {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee("surya", 1, 20000.00));
		l.add(new Employee("name2", 5, 10000.00));
		l.add(new Employee("name3", 11, 90000.00));
		l.add(new Employee("name4", 122, 40000.00));
		for(Employee e : l) {
			System.out.println(e);
		}
	}
}
