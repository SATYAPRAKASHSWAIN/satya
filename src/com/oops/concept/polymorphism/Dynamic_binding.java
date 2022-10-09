package com.oops.concept.polymorphism;
class Doctor{
	void display() {
		System.out.println("Parent class of Doctor");
	}
}class Compounder extends Doctor{
	void display() {
		System.out.println("Child class of Doctor");
	}
}


public class Dynamic_binding {
	public static void main(String[] args) {
		Doctor d=new Compounder();
		d.display();
	}

}
//when the type of object is determined at run_time,it is known as dynamic binding