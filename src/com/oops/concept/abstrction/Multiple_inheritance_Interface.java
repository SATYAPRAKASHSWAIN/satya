package com.oops.concept.abstrction;

interface School {
	void display();
}

interface College {
	void Show();
}
class A9 implements School,College{
	public void display() {
		System.out.println("School life is best life in our childhood");
	}public void Show() {
		System.out.println("College life is the romantic life");
	}
	
}

public class Multiple_inheritance_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
School s=new A9();
s.display();
College c=new A9();
c.Show();
	}

}
