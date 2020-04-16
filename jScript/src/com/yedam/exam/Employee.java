package com.yedam.exam;

public class Employee implements Comparable<Employee>{
	String firstName;
	int salary;
	public Employee(String firstName, int salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public int compareTo(Employee o) {
		return this.firstName.compareTo(o.firstName);
	}

}
