package com.oops.concept.polymorphism;

class Student {
	// final int x = 500;
	int x = 500;

	void display() {
		x = 800;
		System.out.println("After final variable the value of x is:" + x);
	}
}

public class Final_variable_valueNotChnges {
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
	}
}
//comoile tiem