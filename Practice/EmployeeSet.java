package com.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

 class Employee {
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class EmployeeSet {

	public static void main(String[] args) {
		Set<Employee> empSet = new HashSet<>();
//		List<Employee> empList = new ArrayList<>();
		
		empSet.add(new Employee(1, "Abc", 30000));
		empSet.add(new Employee(2, "Def", 40000));
		empSet.add(new Employee(3, "Xyz", 50000));
		
		for(Employee emp : empSet) {
			System.out.println(emp);
		}
	}
}
	
