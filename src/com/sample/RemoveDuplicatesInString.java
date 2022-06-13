package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salry;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalry() {
		return salry;
	}

	public void setSalry(int salry) {
		this.salry = salry;
	}

	public Employee(int id, String name, int salry) {
		super();
		this.id = id;
		this.name = name;
		this.salry = salry;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salry=" + salry + "]";
	}

}

public class RemoveDuplicatesInString {

	public static void main(String[] args) {

		 int a1[] = { 1, 3, 7, 11, 19, 13, 22 };

		// ou/p:--1,11,19,13
		 
		 List<int[]> l=Arrays.asList(a1);
		 System.out.println(a1.toString());

		// List<Integer> arrayList=
		List<Employee> listOfEmp=new ArrayList<>();
		listOfEmp.add(new Employee(1, "A",20000));
		listOfEmp.add(new Employee(2, "B",40000));
		listOfEmp.add(new Employee(3, "C",10000));
		listOfEmp.add(new Employee(4, "D",550000));
		List<?> sortlist=listOfEmp.stream().sorted((i1,i2)->i1.getSalry() <i2.getSalry()?-1:0).collect(Collectors.toList());
		//List<?> sortlist=listOfEmp.stream().sorted((i1,i2)->i1.getSalry() - i2.getSalry()).collect(Collectors.toList());
		System.out.println(sortlist);

		String array[] = { "cat", "rat", "tac", "act" };
		String inPut = "tac";

		char a[] = inPut.toCharArray();
		int inputLen = a.length;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i] == array[j]) {
						
				}
			}
		}

	}

}
