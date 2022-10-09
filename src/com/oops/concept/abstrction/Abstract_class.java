package com.oops.concept.abstrction;

interface A45 {
	void a();

	void b();

	void c();

	void d();
}

abstract class B3 implements A45 {
	public void c() {
		System.out.println(" i am in c");
	}
}

class M implements A45 {
	public void a() {
		System.out.println("i am in a");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("i am in b");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("i am in c");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("i am in d");
	}
}

public class Abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A45 a1 = new M();
		a1.a();
		a1.b();
		a1.c();
		a1.d();

	}

}
