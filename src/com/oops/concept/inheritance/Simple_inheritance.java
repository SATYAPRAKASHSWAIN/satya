package com.oops.concept.inheritance;
class Animal{
	int r=9999;
}class dog extends Animal{
	int k=5555;
}
public class Simple_inheritance {
	public static void main(String[] args) {
		dog d=new dog();
		System.out.println("Parent class integer value"+d.r);
		System.out.println("Child class integer"+d.k);
	}

}
