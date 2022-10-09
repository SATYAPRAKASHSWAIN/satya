package com.oops.concept.abstrction;

interface Market {
	void marketing();
}

class A implements Market {
	public void marketing() {
		System.out.println("Babar market is  one of the best market in our kendrapara");
	}
}

class B implements Market {
	public void marketing() {
		System.out.println("Another market is pattamundai market is also best market in our kendrapara");
	}
}

public interface Simple_interface_program2 {
	public static void main(String[] args) {
		Market m;
		m = new A();
		m.marketing();
		m = new B();
		m.marketing();

	}
}
