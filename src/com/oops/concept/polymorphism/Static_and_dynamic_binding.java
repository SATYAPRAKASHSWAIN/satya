package com.oops.concept.polymorphism;

class dancer {
	static void eat() {//if there is any private ,final or static method in the class is called as static binding 
		System.out.println("Dancers are eating non_vages");
	}
}

public class Static_and_dynamic_binding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dancer d = new dancer();
      d.eat();
	}

}
