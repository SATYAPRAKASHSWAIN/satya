package com.oops.concept.abstrction;

interface Drawble {
	void draw();

	default void msg() {
		System.out.println("default methods");
	}
}

class Rectable implements Drawble {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw my pic in this :");
	}

}

public class Default_method_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawble d = new Rectable();
		d.msg();
        d.draw();
	}

}
