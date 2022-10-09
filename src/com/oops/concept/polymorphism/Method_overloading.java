package com.oops.concept.polymorphism;
class Animal{
	int x;
	void dog() {
		System.out.println("Dog is barking!");
	}
	void dog(int x) {
		System.out.println("Dog is barking by "+x);
	}
}

public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Animal ani=new Animal();
          ani.dog();
          ani.dog(5);
	}

}
