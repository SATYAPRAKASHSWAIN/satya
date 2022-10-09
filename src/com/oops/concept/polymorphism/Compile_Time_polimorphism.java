package com.oops.concept.polymorphism;

class Market {
	static void run() {
		System.out.println("Parent class of static methos");
	}

	static void run(String r) {
		System.out.println("Child class of non_static method");
	}

}

public class Compile_Time_polimorphism {
	public static void main(String[] args) {
		Market m = new Market();
		m.run();
		m.run(null);
	}
}
