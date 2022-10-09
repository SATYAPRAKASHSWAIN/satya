package com.oops.concept.polymorphism;

class Company {
	void work() {
		System.out.println("Company force very high pressure to the current employee");
	}
}

class Employee extends Company {
	void work() {
		System.out.println("Employee are very much hard working as compare the another senior employee");
	}

	void lowSalary() {
		System.out.println("Basically ,Employee salary is very much low!");
	}

	void workload() {
		super.work();
		lowSalary();
	}
}

public class Super_parentClass_method {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.workload();

	}
}
