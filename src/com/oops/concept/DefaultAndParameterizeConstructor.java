package com.oops.concept;

class Student123 {
	int id;
	String name;
	String address;

	Student123() {
		System.out.println("This is the example of default constructor!");
	}

	Student123(int x, String s, String s1) {
		id = x;
		name = s;
		address = s1;
	}

	public void display() {
		System.out.println(id + " " + name + " " + address);
	}

}

public class DefaultAndParameterizeConstructor {
	public static void main(String[] args) {
		Student123 st = new Student123();
		Student123 st1 = new Student123(1, "satya", "kendrapara");
		st.display();
		st1.display();
	}
}
