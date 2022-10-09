package com.oops.concept;
class Employee{
	int id;
	String name;
}
public class ObjectInitializeThroughReference {
	public static void main(String[] args) {
	Employee emp=new Employee();	
	emp.id=101;
	emp.name="Satya";
	System.out.println(emp.id+" "+emp.name);
		
	}

}
