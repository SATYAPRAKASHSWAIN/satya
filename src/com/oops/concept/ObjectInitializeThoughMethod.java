package com.oops.concept;

class Student {
	int id;
	String name;
	String address;

	void insertREcord(int r, String s, String s1) {
		id = r;
		name = s;
		address = s1;
	}

	void display() {
		System.out.println(id + " " + name + " " + address);
	}
}

public class ObjectInitializeThoughMethod {
	public static void main(String[] args) {
		Student stu = new Student();
		Student stu1 = new Student();
		Student stu2 = new Student();
		stu.insertREcord(1, " satya", "kendrapara");
		stu1.insertREcord(2, " pranab", "paradip");
		stu2.insertREcord(3, " chita", "paradip");
		stu.display();
		stu1.display();
		stu2.display();

	}
}
