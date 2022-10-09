package com.oops.concept.abstrction;

interface Marker {
	void satya();
}

interface Mark {
	void chiku();
}

interface A7 extends Marker {
	void chikua();
}

class A5 implements A7 {
	@Override
	public void satya() {
		// TODO Auto-generated method stub
		System.out.println("Satya is a good boy");
	}

	@Override
	public void chikua() {
		// TODO Auto-generated method stub
		System.out.println("Chikua is a good boy");
	}
}

public interface Interface_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7 m = new A5();
		m.satya();
		m.chikua();
	}

}
