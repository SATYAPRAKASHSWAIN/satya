package com.oops.concept.abstrction;

interface printable {
	void print();
}

class A6 implements printable {
	public void print() {
		System.out.println("This is the first program of interface");
	}
}

public interface Simple_interface_program {
	public static void main(String[] args) {
		printable p = new A6();
		p.print();
	}
}
