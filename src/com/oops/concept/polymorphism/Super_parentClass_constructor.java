package com.oops.concept.polymorphism;

class College {
	College() {
		System.out.println("Gita is the best college in Bbsr");
	}

	College(String n) {
		System.out.println("Gita is the best ");
	}

}

class School extends College {
	School() {
		// super();
		super(null);

		System.out.println("School life is the best life in childhood!");
	}
}

public class Super_parentClass_constructor {
	public static void main(String[] args) {
		School s = new School();

	}
}
