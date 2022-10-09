package com.oops.concept.polymorphism;

class Car12 {
	String color = "White";
}
class BMW extends Car12 {
	String color = "Black";

	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class Super_parentClass_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            BMW b=new BMW();
            b.printColor();
	}

}
