package com.oops.concept.abstrction;

interface Draw {
	void draw();

	static  int msg(int x) {
		return x * x * x;

	}
}

class Cube implements Draw {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw the my penting");
	}

}

public class Static_method_interface {
	public static void main(String[] args) {
		Draw d = new Cube();
		d.draw();
		System.out.println("method of hte interface is :" + Draw.msg(5));
	}

}
