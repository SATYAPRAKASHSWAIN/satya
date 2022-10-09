package com.oops.concept.polymorphism;

class A {
	A foo() {
		return this;
	}

	void print() {
		System.out.println("Inside the class A");
	}

}

class B extends A {
	B foo() {
		return this;
	}

	void print() {
		System.out.println("Inside the class B");
	}
}

public class Covarient_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.foo().print();
		B b = new B();
		b.foo().print();
	}

}
