package com.oops.concept.abstrction;

abstract class B1 {
	B1() {
		System.out.println("Abstract class constructor");
	}

	 void run() {
		 
	 }

	void changedata() {
		System.out.println("abstract method ");
	}
}

class H1 extends B1 {
	void run() {
		System.out.println("non_abstract class methods");
	}
}

public class AbstractClass_Constructor_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj = new H1();
		obj.run();
		obj.changedata();
	}

}
