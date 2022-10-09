package com.oops.concept;

class Studen121 {
	int rollNo;
	String name;
	static String college = "Gita";
	static String address = "Bbsr";

	Studen121(int n, String r) {
		rollNo = n;
		name = r;
	}

	void display() {
		System.out.println(rollNo + " " + name + " " + college + " " + address);
	}
}

public class Static_variable {
	public static void main(String[] args) {
		Studen121 stu = new Studen121(1, "Satya");
		Studen121 stu1 = new Studen121(2, "chiku");

		stu.display();
		stu1.display();
	}

}
