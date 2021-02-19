package com.collections;

public class EmployeePojo implements Comparable<EmployeePojo> {

	private int id;
	private String empName;
	private String salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public EmployeePojo(int id, String empName, String salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeePojo [id=");
		builder.append(id);
		builder.append(", empName=");
		builder.append(empName);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(EmployeePojo o) {
		
		return this.id - o.id;
	}
	
}
