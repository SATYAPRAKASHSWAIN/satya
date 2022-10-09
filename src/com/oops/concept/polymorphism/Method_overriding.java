package com.oops.concept.polymorphism;

class Car {
	void tatanono(int x) {
		System.out.println("tata nano is the best car in the world!");
	}
}

class maruti extends Car {
	void tatanono(int x) {
		System.out.println("tata nano is very bar car");
	}
}

public class Method_overriding {
	public static void main(String[] args) {
		Car c=new Car();
		c.tatanono(5);
		maruti m=new maruti();
		m.tatanono(0);

	}
}
