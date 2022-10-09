package com.oops.concept;

class method {
	int rollNo;
	String name;
	static String college = "Gita";

	static void change() {
		college = "BPUT";
	}

	method(int r, String n) {
		rollNo = r;
		name = n;

	}

	void display() {
		System.out.println(rollNo + " " + name + " " + college);
	}
}

public class Static_method {
	public static void main(String[] args) {
		method.change();
		method md = new method(1, "Satya");
		md.display();
	}

}
