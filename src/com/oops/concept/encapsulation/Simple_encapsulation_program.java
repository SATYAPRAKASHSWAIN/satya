package com.oops.concept.encapsulation;

class Student {
	private int name;

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

}

public class Simple_encapsulation_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setName(456);
		System.out.println("Encapsulation result is:"+s.getName());
		

	}

}
