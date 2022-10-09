package com.oops.concept.polymorphism;

class Univercity {
	Univercity() {
		System.out.println("Parent class constructor!");//1st
	}

}

class College34 extends Univercity {
	College34() {
		super();
		System.out.println("Child class constructor!");//3rd
	}

	{
		System.out.println("satya");//2nd
	}
}

public class Instance_initilizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College34 c = new College34();

	}

}
