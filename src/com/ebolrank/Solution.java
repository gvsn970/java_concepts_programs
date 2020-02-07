package com.ebolrank;

import java.util.*;
import java.util.stream.Collectors;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", fname=");
		builder.append(fname);
		builder.append(", cgpa=");
		builder.append(cgpa);
		builder.append("]");
		return builder.toString();
	}
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
	
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1,"surya",34));
		studentList.add(new Student(2,"china",35));
		studentList.add(new Student(3,"venky",34));
		//Collections.sort(studentList, (i1,i2) -> i1<i2?);
		//studentList.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).forEach(System.out:: println);;
//		
//		 List<Student> sortedList = studentList.stream()
//					.sorted(Comparator.comparing(Student::getFname))
//					.collect(Collectors.toList());
//		 
//		        for(Student s : sortedList) {
//		        	System.out.println(s.getFname());
//		        }
		for(int i=0;i<studentList.size();i++) {
			
		}
 
	}
}



