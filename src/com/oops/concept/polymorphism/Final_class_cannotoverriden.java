package com.oops.concept.polymorphism;

class CollegeC {
	//final void run() {
	void run() {
		System.out.println("final class cann't overriden");
	}
}

class School12 extends CollegeC {
	void run() {
		System.out.println("Final class cann't overriden");
	}
}

public class Final_class_cannotoverriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School12 sc = new School12();
		sc.run();
	}

}
