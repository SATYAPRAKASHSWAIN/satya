package com.oops.concept.polymorphism;

class Bank {
	float getvalue() {
		return 0;
	}
}

class SBI extends Bank {
	float getvalue() {
		return 5.6f;
	}
}

class ICICI extends SBI {
	float getvalue() {
		return 34;
	}
}

class Axis extends ICICI {
	float getvalue() {
		return 34f;
	}
}

public class Runtime_polymorphism {
	public static void main(String[] args) {
		Bank b;
		b = new Bank();
		System.out.println("Rate of interest is:" + b.getvalue());
		b = new SBI();
		System.out.println("Rate of interast is:" + b.getvalue());
		b = new ICICI();
		System.out.println("Rate of interest is:" + b.getvalue());
		b = new Axis();
		System.out.println("Rate of interest is" + b.getvalue());
	}

}
