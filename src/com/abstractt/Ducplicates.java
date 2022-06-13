package com.abstractt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp{
	int id;
	String name;
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
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}
public class Ducplicates {

	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<>();
			list.add(new Emp(1,"Abs"));
			list.add(new Emp(1,"cbs"));
			list.add(new Emp(1,"ss"));
			list.add(new Emp(1,"Zbs"));
			List<?> sortList=list.stream().sorted((i1,i2)->i1.getName().compareTo(i2.getName())).collect(Collectors.toList());
			System.out.println(sortList);
			
	}
}
