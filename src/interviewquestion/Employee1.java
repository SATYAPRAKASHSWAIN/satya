package interviewquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee1 {
	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee("Satya", 25, 10000));
		employee.add(new Employee("Biplab", 24, 15000));
		employee.add(new Employee("Smruti", 26, 20000));
		employee.add(new Employee("Bhabani", 24, 40000));
		employee.add(new Employee("Pranab", 27, 50000));
		//System.out.println("Original Salary!");
		//System.out.println(employee);

		List<Employee> increamentsalary = employee.stream().map(e -> {
			if (e.getAge() > 25) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;

		}).collect(Collectors.toList());

		
		  System.out.println("Increment salary!!");
		  System.out.println(increamentsalary);
		 
		
		
		Collections.sort(employee,(o1,o2)-> o1.getName().compareTo(o2.getName()));
		//System.out.println(employee);
		
		
		



	}
}