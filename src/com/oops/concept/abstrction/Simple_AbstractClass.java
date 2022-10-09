package com.oops.concept.abstrction;

abstract class Bike {
	//abstract void run() {
	void run() {
		System.out.println("Run safely by abstract class..............");
	}
}

class Honda extends Bike {

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Runing safely...............");
	}

}

public class Simple_AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Honda();
		obj.run();

	}

}
//if class is abstract ,then it don't need method to be abstract may be may not be
//if method of the inside class is abstract then class must be abstract